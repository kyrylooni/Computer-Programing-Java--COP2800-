/**
 * @author KyryloO
 *
 * This application is based incorporates SQL mechanics of a CRUD (Create, Read, Update, Delete) framemework using JDBC connector, Apache WebSever, and MySQL database using XAMPP
 * software. In this case, EmployeeTable includes EmployeeID column which gets auto-incremented integer and a primary key , EmployeeFirstName column, EmployeeLastName,
 * YearBorn in DATE format, and Base Slary in a character format
 *
 *
 *
 */




package MyApplicationDatabase;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeTable {

    // main method
    public static void main(String[] args) throws Exception {
        // establishes a connection with Apache server
        createTable();
        //adds each entry in a database.
        post();
        // displays each inpputed entry from the database into the JVM environment
        extract();
    }

    // selects each column and row and displays it into the JVM
    public static ArrayList<String> extract() throws Exception {
        try {
            Connection con = getConnection();
            PreparedStatement query = con.prepareStatement("SELECT * FROM Employee");

            ResultSet queryresult = query.executeQuery();

            ArrayList<String> queryarray = new ArrayList<String>();

            while (queryresult.next()) {
                System.out.print(queryresult.getInt("EmployeeID"));
                System.out.print(" ");
                System.out.print(queryresult.getString("EmployeeFirstName"));
                System.out.print(" ");
                System.out.print(queryresult.getString("EmployeeLastName"));
                System.out.print(" ");
                System.out.print(queryresult.getDate("YearBorn"));
                System.out.print(" ");
                System.out.print(queryresult.getString("BaseSalary"));
                System.out.print(" ");
                System.out.println();

            }
            System.out.println("\n\nAll query results have been displayed");
            return queryarray;
        } catch (Exception e) {
            System.out.println(e);

        return null;
        }
    }
    // add a new entry for each row into each specified column.
    public static void post() throws Exception {
        try {
            Connection con = getConnection();
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO Employee VALUES (1, 'John' ,'Smith', 19640502, '82,256')");
            st.executeUpdate("INSERT INTO Employee VALUES (2, 'Karen' ,'Price', 19820325, '97,300')");
            st.executeUpdate("INSERT INTO Employee VALUES (3, 'Sue' ,'Jones', 19930111, '42,567')");
            st.executeUpdate("INSERT INTO Employee VALUES (4, 'Bob' ,'Lewis', 19880806, '75,000')");
            st.executeUpdate("INSERT INTO Employee VALUES (5, 'Tomas' ,'Pomares', 19990605, '30,377')");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Insertion of values were completed ");
        }
    }

    // create a table a specified number of columns
    private static void createTable() throws Exception {
        try {
            Connection con = getConnection();
            PreparedStatement tablecreate = con.prepareStatement("CREATE TABLE Employee (EmployeeID INT(64) NOT NULL AUTO_INCREMENT, EmployeeFirstName VARCHAR(50), EmployeeLastName VARCHAR(50), YearBorn DATE, BaseSalary VARCHAR(50), PRIMARY KEY(EmployeeID)) ");
            tablecreate.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Table created and function completed");
        }
    }
    // connect to the Apache Web Server database
    public static Connection getConnection() throws Exception {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/my_application_database";
            String username = "root";
            String password = "";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected to the MyApplication database");
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
