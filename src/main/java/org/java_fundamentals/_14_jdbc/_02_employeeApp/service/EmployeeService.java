package org.java_fundamentals._14_jdbc._02_employeeApp.service;

import org.java_fundamentals._14_jdbc._02_employeeApp.dao.EmployeeDAO;
import org.java_fundamentals._14_jdbc._02_employeeApp.dao.impl.EmployeeDAOImpl;
import org.java_fundamentals._14_jdbc._02_employeeApp.model.Employee;
import org.java_fundamentals._14_jdbc._02_employeeApp.util.StringUtil;

import java.util.List;
import java.util.Optional;

public class EmployeeService {
    private final EmployeeDAO employeeDAO = new EmployeeDAOImpl();

    public boolean addEmployee(Employee e){
        if (StringUtil.isBlank(e.getFullName()) || StringUtil.isBlank(e.getEmail())){
            System.out.println("Fullname and email cannot be empty.");
            return false;
        }

        if (!e.getEmail().contains("@")){
            System.out.println("Email must containg @ symbol.");
            return false;
        }

        return employeeDAO.save(e);
    }

    public List<Employee> getAll(){
        return employeeDAO.findAll();
    }

    public Optional<Employee> getById(int id){
        if (id <= 0){
            System.out.println("Id must be greater than 0.");
            return Optional.empty();
        }

        return employeeDAO.findById(id);
    }


    public List<Employee> getByDepartmentId(int departmentId){
        if (departmentId <= 0){
            System.out.println("Id must be greater than 0.");
            return List.of();
        }
        return employeeDAO.findByDepartmentId(departmentId);
    }

    public boolean updateFullName(int id, String newName){
        if (id <= 0){
            System.out.println("Id must be greater than 0.");
            return false;
        }

        if (StringUtil.isBlank(newName)){
            System.out.println("New name can not be empty.");
            return false;
        }

        return employeeDAO.updateFullName(id,newName);
    }

    public boolean transfer(int employeeId, int newDepartmentId){
        if (employeeId <= 0 || newDepartmentId <= 0){
            System.out.println("Id must be greater than 0.");
            return false;
        }
        return employeeDAO.transfer(employeeId, newDepartmentId);
    }

    public boolean deleteById(int id){
        if (id <= 0){
            System.out.println("Id must be greater than 0.");
            return false;
        }

        return employeeDAO.deleteById(id);
    }












}
