import DAO.Employee;
import DAO.EmployeeDAO;
import DAO.EmployeeDaoImpl;

import java.awt.print.Book;
import java.sql.*;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {



        /*final String user = "postgres";
        final String password = "bdo_20030418";
        final String url = "jdbc:postgresql://localhost:5432/skypro";

        try (final Connection connection =
                     DriverManager.getConnection(url, user, password);
             PreparedStatement statement =
                     connection.prepareStatement("SELECT * FROM employee")) {

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String last = resultSet.getString("first_name");
                System.out.println("last: " + last);

                String first = resultSet.getString("last_name");
                String gender = resultSet.getString("gender");
                //String town = resultSet.getString("town");

                System.out.println("имя: " + first +last);
                System.out.println("пол: " + gender);
                //System.out.println("город: " + town);
            }
            System.out.println("Соединение установлено!");

        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к базе данных!");
            e.printStackTrace();
        }

            // Исключение для обработки возможных ошибок при подключении
        }*/

        EmployeeDAO employeeDAO = new EmployeeDaoImpl();
        List<Employee> employees=employeeDAO.getAllEmployee();

        for (Employee employee : employees) {
            System.out.println("firstBook ID: " + employee.getFirst_name());
            System.out.println("Last: " + employee.getLast_name());
            System.out.println("Gender: " +employee.getGender());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Town: " + employee.getTown());

        }

}}