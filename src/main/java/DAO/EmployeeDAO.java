package DAO;

import java.util.List;

public interface EmployeeDAO {



        List<Employee> getAllEmployee();
        EmployeeDAO getEmployeeById(int id);
        void createEmployee(Employee employee);
        void updateEmployee(Employee employee);
        void deleteEmployee(int id);
    }

