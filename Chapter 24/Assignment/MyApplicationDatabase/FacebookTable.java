/**
 * @author KyryloO
 *
 * This application is based incorporates SQL mechanics of a CRUD (Create, Read, Update, Delete) framemework using JDBC connector, Apache WebSever, and MySQL database using XAMPP
 * software. In this case, FacebookUsers includes Username column which gets a primary key, UserFirstName column, UserLastName, EmployeeLastName,
 * YearBorn in DATE format, and EmailAddress in a character format.
 *
 *
 *
 */


package MyApplicationDatabase;

import java.sql.*;
import java.util.ArrayList;

public class FacebookTable {
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
            PreparedStatement query = con.prepareStatement("SELECT * FROM FacebookUsers");

            ResultSet queryresult = query.executeQuery();

            ArrayList<String> queryarray = new ArrayList<String>();

            while (queryresult.next()) {
                System.out.print(queryresult.getString("Username"));
                System.out.print(" ");
                System.out.print(queryresult.getString("UserFirstName"));
                System.out.print(" ");
                System.out.print(queryresult.getString("UserLastName"));
                System.out.print(" ");
                System.out.print(queryresult.getDate("YearBorn"));
                System.out.print(" ");
                System.out.print(queryresult.getString("EmailAddress"));
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
            st.executeUpdate("INSERT INTO FacebookUsers VALUES ('__k_real___', 'Kyrylo' ,'Onishchenko', 20020526, 'kiriloni2k17@gmail.com')");
            st.executeUpdate("INSERT INTO FacebookUsers VALUES ('t_pomares28', 'Tomas' ,'Pomares', 20030704, 't_pomares28@yahoo.com')");
            st.executeUpdate("INSERT INTO FacebookUsers VALUES ('gabrielle.rossado', 'Gabrielle' ,'Rossado', 20030217, 'gabe_r@daytonastate.edu')");
            st.executeUpdate("INSERT INTO FacebookUsers VALUES ('fernanda45', 'Fernanda' ,'Castillo', 20010911, 'f_castillo@gmail.com')");
            st.executeUpdate("INSERT INTO FacebookUsers VALUES ('a.jensen74', 'Anders' ,'Jensen', 19990724, 'kiriloni2k17@gmail.com')");
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
            PreparedStatement tablecreate = con.prepareStatement("CREATE TABLE FacebookUsers (Username VARCHAR(64), UserFirstName VARCHAR(50), UserLastName VARCHAR(50), YearBorn DATE, EmailAddress VARCHAR(50), PRIMARY KEY(Username )) ");
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

