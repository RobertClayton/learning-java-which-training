package console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AutocloseableExample {
    public static void main(String[] args) {
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection("");
//        } catch (SQLException e) {
//
//        }
//        finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }

//        IllegalArgumentException ex = new IllegalArgumentException("message...");
//        throw ex;

        try(Connection connection = DriverManager.getConnection("")) {

        } catch (SQLException e) {

        }
    }
}
