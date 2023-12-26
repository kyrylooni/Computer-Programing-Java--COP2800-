/**
 * @author KyryloO
 *
 * This application is based incorporates SQL mechanics of a CRUD (Create, Read, Update, Delete) framemework using JDBC connector,
 * Apache WebSever, and MySQL database using XAMPP software.
 * In this case, BankAccountsTables includes BankID column which a primary key, AccountFirstName, AccountLastName integer column,
 * SocialSecurity4Digits, InitialDeposit char column,
 *
 *
 *
 */


package MyApplicationDatabase;

import java.sql.*;
import java.util.ArrayList;

public class BankAccountsTable {
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
            PreparedStatement query = con.prepareStatement("SELECT * FROM BankAccounts");

            ResultSet queryresult = query.executeQuery();

            ArrayList<String> queryarray = new ArrayList<String>();

            while (queryresult.next()) {
                System.out.print(queryresult.getInt("BankID"));
                System.out.print(" ");
                System.out.print(queryresult.getString("AccountFirstName"));
                System.out.print(" ");
                System.out.print(queryresult.getString("AccountLastName"));
                System.out.print(" ");
                System.out.print(queryresult.getInt("SocialSecurity4Digits"));
                System.out.print(" ");
                System.out.print(queryresult.getString("InitialDeposit"));
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
            st.executeUpdate("INSERT INTO BankAccounts VALUES (67578903, 'John' ,'Smith', '7861', '$3,100')");
            st.executeUpdate("INSERT INTO BankAccounts VALUES (24678856, 'Karen' ,'Price', '4575', '$950')");
            st.executeUpdate("INSERT INTO BankAccounts VALUES (36678856, 'Sue' ,'Jones', '8965', '$5,600')");
            st.executeUpdate("INSERT INTO BankAccounts VALUES (84509423, 'Bob' ,'Lewis', 7896, '$12,000')");
            st.executeUpdate("INSERT INTO BankAccounts VALUES (56097823, 'Tomas' ,'Pomares', 5678, '$30,070')");
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
            PreparedStatement tablecreate = con.prepareStatement("CREATE TABLE BankAccounts (BankID INT(8), AccountFirstName VARCHAR(50), AccountLastName VARCHAR(50), SocialSecurity4Digits INT(50), InitialDeposit VARCHAR(8), PRIMARY KEY(BankID)) ");
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


