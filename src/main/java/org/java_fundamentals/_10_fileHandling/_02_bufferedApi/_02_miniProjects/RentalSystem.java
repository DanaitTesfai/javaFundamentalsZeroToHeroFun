package org.java_fundamentals._10_fileHandling._02_bufferedApi._02_miniProjects;

import java.io.*;
import java.util.ArrayList;

public class RentalSystem {
    private final String USER_FILE = "users.txt";
    private final String VEHICLE_FILE = "vehicles.txt";

    ArrayList<User> users = new ArrayList<>();
    ArrayList<Vehicle> vehicles = new ArrayList<>();


    public RentalSystem() {
        User admin = new User("admin", "1234");
        User user1 = new User("user1", "12345");
        loadVehiclesFromFile();
        loadUsersFromFile();

        if (!users.contains(admin)){
            registerUser(admin);
        }
        if (!users.contains(user1)){
            registerUser(user1);
        }

    }


    public User loginUser(String username, String password){
        for (User u: users){
            if (u.getUsername().equalsIgnoreCase(username) && u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }

    public void registerUser(User u){
        if (users.contains(u)){
            System.out.println("User already exists.");
        }else {
            users.add(u);
            System.out.println("Registration successful!");
            saveUsersToFile();
        }

    }

    public void addVehicle(Vehicle v){
        if (vehicles.contains(v)){
            System.out.println("Vehicle already exists.");
            return;
        }
        vehicles.add(v);
        saveVehiclesToFile();
        System.out.println("Vehicle saved successfully.");

    }

    public void deleteVehicle(String vid){
        vehicles.removeIf(v -> v.getId().equalsIgnoreCase(vid));
        saveVehiclesToFile();
        System.out.println("Vehicle deleted successfully.");
    }

    public void showVehicles(){
        if (vehicles.isEmpty()){
            System.out.println("There are no vehicles in the system.");
            return;
        }
        System.out.println("Available vehicles.");
        for (Vehicle v: vehicles){
            v.displayInfo();
        }

    }

    public void searchVehicle(String keyword){
        System.out.println("\uD83D\uDD0D Search Results for: " + keyword);
        for (Vehicle v: vehicles){
            if (v.getModel().toLowerCase().contains(keyword.toLowerCase()) ||
                    v.getType().toLowerCase().contains(keyword.toLowerCase())) {
                v.displayInfo();
                return;
            }
        }
        System.out.println("No matching vehicles found.");
    }

    public  void updateVehicle(Vehicle updateVeh){
        if (!vehicles.contains(updateVeh)){
            System.out.println("Vehicle not found.");
            return;
        }
        for (Vehicle v: vehicles){
            if (v.getId().equalsIgnoreCase(updateVeh.getId())){
                v.setModel(updateVeh.getModel());
                v.setType(updateVeh.getType());
                v.setPricePerDay(updateVeh.getPricePerDay());
                saveVehiclesToFile();
                System.out.println("Vehicle updated successfully.");
            }

        }
    }

    public void rentVehicle(User u, String vid, String date){
        for (Vehicle v: vehicles){
            if (vid.equalsIgnoreCase(v.getId())){
                if (!v.isAvailable()){
                    System.out.println("❌ Sorry, this vehicle is already rented.");
                    return;
                }
                u.addRental(new Rental(v, date));
                v.setAvailable(false);
                saveUsersToFile();
                System.out.println("Vehicle rented successfully.");
                return;
            }
        }
        System.out.println("Vehicle not available.");

    }

    public void showRentedVehicles(User u){
        if (u.rentals.isEmpty()){
            System.out.println("There are no rented vehicles");
            return;
        }
        for (Rental r: u.rentals){
            System.out.println(r.rentedVehicle);
        }
    }

    public void returnVehicle(User u, String returnId){
        for (int i = 0; i < u.rentals.size(); i++){
            Rental r = u.rentals.get(i);
            Vehicle v = r.getRentedVehicle();
            if (v.getId().equalsIgnoreCase(returnId)){
                v.setAvailable(true);
                u.rentals.remove(i);
                saveUsersToFile();
                saveVehiclesToFile();
                System.out.println("Vehicle returned successfully.");
                return;
            }
        }
        System.out.println("You did not rent this vehicle.");
    }

    public void saveUsersToFile(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE))){
            for (User u: users){
                writer.write(u.getUsername() + "," + u.getPassword());
                writer.newLine();
                for (Rental r: u.rentals){
                    writer.write("RENTAL:" + r.rentedVehicle.getId()+":"+ r.getRentalDate());
                    writer.newLine();
                }
                writer.write("ENDUSER");
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void loadUsersFromFile(){
        try(BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))){
            User currentUser = null;
            String line;
            while ((line = reader.readLine()) != null){
                if (line.startsWith("RENTAL:")){
                    String[] parts = line.split(":");
                    String vid = parts[1];
                    String date = parts[2];

                    Vehicle v = getVehicleById(vid);
                    if (v != null && currentUser != null){
                        currentUser.addRental(new Rental(v,date));
                    }
                }else if (line.equals("ENDUSER")) {
                    currentUser = null;
                }else {
                    String[] data = line.split(",");
                    currentUser = new User(data[0], data[1]);
                    users.add(currentUser);
                }
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }



    public Vehicle getVehicleById(String vid){
        for (Vehicle v: vehicles){
            if (v.getId().equalsIgnoreCase(vid)){
                return v;
            }
        }
        return null;
    }

    public void saveVehiclesToFile(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(VEHICLE_FILE))){
            for (Vehicle v : vehicles){
                writer.write(v.getId() + "," + v.getModel() + "," + v.getType() + "," + v.getPricePerDay() + "," + v.isAvailable());
                writer.newLine();
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void loadVehiclesFromFile(){
        try(BufferedReader  reader = new BufferedReader(new FileReader(VEHICLE_FILE))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                String id = parts[0];
                String model = parts[1];
                String type = parts[2];
                double pricePerDay = Double.parseDouble(parts[3]);
                boolean available = Boolean.parseBoolean(parts[4]);

                Vehicle v = new Vehicle(id,model, type, pricePerDay);
                v.setAvailable(available);
                vehicles.add(v);

            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }


}
