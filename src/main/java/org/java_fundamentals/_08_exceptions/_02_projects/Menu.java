package org.java_fundamentals._08_exceptions._02_projects;


import java.util.Scanner;

public class Menu {

    public void start(Scanner sc, UserManager um, StudentManager sm) {
        System.out.println("===EduTrack ===");
        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        try {
            User u = um.authenticate(username, password);
            if (u.isAdmin()) {
                System.out.println("Welcome admin! " + u.getUsername());
                adminMenu(sc, um, sm);
            } else {
                System.out.println("Welcome staff! " + u.getUsername());
                staffMenu(sc,sm);
            }
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public void adminMenu(Scanner sc, UserManager um, StudentManager sm) {
        while (true) {
            System.out.println("=== ADMIN MENU - EduTrack ===");
            System.out.println("1. User Management");
            System.out.println("2. Student Management");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    userManagement(sc, um);
                    break;
                case 2:
                    studentManagement(sc,sm);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public void userManagement(Scanner sc, UserManager um) {
        while (true) {
            System.out.println("1. Register New Staff User\n" +
                    "2. View All Users\n" +
                    "3. Deactivate User\n" + "   " +
                    "4.Back");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    registerStaffUser(sc, um);
                    break;
                case 2:
                    viewUsers(um);
                    break;
                case 3:
                    deactivateUser(sc, um);
                    break;
                case 4:
                    System.out.println("Back to admin menu.");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }


    public void registerStaffUser(Scanner sc, UserManager um) {
        try {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            User u = new User(username, password, "Staff", true);

            boolean ok = um.addUser(u);

            System.out.println(ok ? "Staff added successfully." : "Duplicate staff. Staff already exists.");

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void viewUsers(UserManager um) {
        um.listUsers();
    }

    public void deactivateUser(Scanner sc, UserManager um) {
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        boolean ok = um.deactivateUser(username);
        System.out.println(ok ? "User deactivated." : "User not found.");
    }


    public void studentManagement(Scanner sc,StudentManager sm) {
        while (true) {
            System.out.println("1. Register Student\n" +
                    "2. View All Students\n" +
                    "3. Search Student by ID\n" +
                    "4. Calculate Fee / Complete Course\n" +
                    "5. Back");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    registerStudents(sc,sm);
                    break;
                case 2:
                    viewStudents(sm);
                    break;
                case 3:
                    searchStudent(sc,sm);
                    break;
                case 4:
                    completeCourse(sc,sm);
                    break;
                case 5:
                    System.out.println("Back to admin menu.");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public void registerStudents(Scanner sc, StudentManager sm){
        try {
            System.out.print("Enter Student Id: ");
            String studentID = sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter Course duration: ");
            int courseDuration = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter status: ");
            String status = sc.nextLine();

            System.out.print("Enter monthly fee: ");
            double monthlyFee = sc.nextDouble();

            System.out.println("Choose a student: 1.Regular Student 2.Scholarship Student : ");
            int studentType = sc.nextInt();

            Student student;

            if (studentType == 1){
                student = new RegularStudent(studentID, name,age, courseDuration, status, monthlyFee);
            } else if (studentType == 2) {
                System.out.print("Enter discount percentage: %");
                double discountPercentage = sc.nextDouble();
                sc.nextLine();

                student = new ScholarshipStudent(studentID, name, age,courseDuration, status, monthlyFee,discountPercentage);
            }else {
                System.out.println("Invalid input.");
                return;
            }

            boolean ok = sm.addStudent(student);

            System.out.println(ok ? "Student registered successfully." : "Duplicate Student Id. Registration failed.");

        }catch (InvalidInputException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void viewStudents(StudentManager sm){
        sm.listStudents();

    }

    public void searchStudent(Scanner sc, StudentManager sm){
        try{
            System.out.print("Enter Student Id: ");
            String studentId = sc.nextLine();

            Student student = sm.findById(studentId);
            student.displayInfo();

        }catch (UserNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void completeCourse(Scanner sc, StudentManager sm){
        System.out.print("Enter student Id: ");
        String studentId = sc.nextLine();

        sm.completeCourse(studentId);
    }


    public void staffMenu(Scanner sc,StudentManager sm) {
        System.out.println(" === STAFF MENU - EduTrack ===");
        System.out.println("   1. Register Student\n" +
                "    2. View All Students\n" +
                "    3. Search Student by ID\n" +
                "    4. Calculate Fee / Complete Course\n" +
                "    5. Back\n" +
                "    6. Exit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice){
            case 1:
                registerStudents(sc,sm);
                break;
            case 2:
                viewStudents(sm);
                break;
            case 3:
                searchStudent(sc,sm);
                break;
            case 4:
                completeCourse(sc,sm);
                break;
            case 5:
                System.out.println("Back to Main menu.");
                return;
            default:
                System.out.println("Invalid input. Please try again.");
        }
    }

}
