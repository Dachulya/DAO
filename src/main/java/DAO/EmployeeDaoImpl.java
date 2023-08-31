package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDAO{
    final String user = "postgres";
    final String password = "bdo_20030418";
    final String url = "jdbc:postgresql://localhost:5432/skypro";


    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employees=new ArrayList<>();
        try (final Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement =
                     connection.prepareStatement("SELECT * FROM employee")) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String first_name=resultSet.getString("first_name");
                String last_name=resultSet.getString("last_name");
                String gender=resultSet.getString("gender");
                Integer age=resultSet.getInt("age");
                Integer town=resultSet.getInt("town");


                Employee.add(new Employee(first_name,last_name,gender,age,town));

        }

        return null;
    } catch (SQLException e) {
                System.out.println("Ошибка при подключении к БД!");
                e.printStackTrace();
        }
        return employees;}

        @Override
    public EmployeeDAO getEmployeeById(int id) {
        return null;
    }

    @Override
    public void createEmployee(Employee employer) {

    }

    @Override
    public void updateEmployee(Employee employer) {

    }

    @Override
    public void deleteEmployee(int id) {

    }
}
