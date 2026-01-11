package org.java_fundamentals._14_jdbc._02_employeeApp.service;

import org.java_fundamentals._14_jdbc._02_employeeApp.dao.DepartmentDAO;
import org.java_fundamentals._14_jdbc._02_employeeApp.dao.impl.DepartmentDAOImpl;
import org.java_fundamentals._14_jdbc._02_employeeApp.model.Department;
import org.java_fundamentals._14_jdbc._02_employeeApp.util.StringUtil;

import java.util.List;
import java.util.Optional;

public class DepartmentService {
    private final DepartmentDAO departmentDAO = new DepartmentDAOImpl();

    public boolean addDepartment(Department d){
        if (StringUtil.isBlank(d.getName()) || StringUtil.isBlank(d.getLocation())){
            System.out.println("Department name and location can not be empty.");
            return false;
        }
        return departmentDAO.save(d);

    }


    public List<Department> getAll(){
        return departmentDAO.findAll();
    }

    public Optional<Department> getById(int id){
        if (id <= 0 ) return Optional.empty();

        return  departmentDAO.findById(id);
    }

    public boolean updateLocation(int id, String newLocation){
        if (StringUtil.isBlank(newLocation)){
            System.out.println("Location can not be empty.");
            return false;
        }
        if (id <= 0){
            System.out.println("Id must be greater than 0.");
            return false;
        }

        return departmentDAO.updateLocation(id, newLocation);
    }

    public boolean deleteById(int id){
        if (id <= 0){
            System.out.println("Id must be greater than 0.");
            return false;
        }

        return departmentDAO.deleteById(id);

    }


}
