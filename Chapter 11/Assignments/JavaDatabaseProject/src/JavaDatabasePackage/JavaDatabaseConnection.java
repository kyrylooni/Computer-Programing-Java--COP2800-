package JavaDatabasePackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class JavaDatabaseConnection {

    /**
     * Simple code to do a basic java database connection
     */
    public static void main(String[] args) throws Exception {
        getConnection();
    }

    public static Connection getConnection() throws Exception {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/information_schema";
            String username = "root";
            String password = "";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected to the Information schema database");
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

}
