package console;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        String connectionString = "jdbc:mysql://localhost:3306/filmstore";
        String username = "root";
        String password = "";

        try(Connection connection = DriverManager.getConnection(
                connectionString, username, password)) {
            System.out.printf("connected to %s%n",
                    connection.getMetaData().getDatabaseProductName());

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select * from film where title like ?"
            );
            preparedStatement.setString(1, "%the%");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String title = resultSet.getString("title");
                System.out.println(title);
            }

//            String sql = "delete * from film where title id = 1";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setInt(1,1);
//            int rows = preparedStatement.executeUpdate();

//            System.out.printf("%d rows deleted ", rows);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
