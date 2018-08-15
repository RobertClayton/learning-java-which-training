package console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("5");
            connectToDb();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            // a finally block will always be executed
        }
        System.out.println("Continuing...");
    }

    private static void connectToDb() throws SQLException {
        Connection connection = DriverManager.getConnection("");
    }
}
