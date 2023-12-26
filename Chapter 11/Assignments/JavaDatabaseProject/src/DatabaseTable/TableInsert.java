package DatabaseTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;




    public class TableInsert {

    public static void main(String[] args) throws Exception {
        post();
    }

    public static void post() throws Exception {
        try {
            Connection con = getConnection();
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO Student VALUES (7,'Melissa', ' ', 'Jones', 200200, '237057')");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Insertion of values were completed ");
        }
    }


    private static void createTable() throws Exception {
        try {
            Connection con = getConnection();
            PreparedStatement tablecreate = con.prepareStatement("CREATE TABLE Student (StudentID INT(64) NOT NULL AUTO_INCREMENT, StudentFirstName VARCHAR(50), StudentMiddleInitial char(2), StudentLastName VARCHAR(50), EnrollmentDate DATE, ProgramMajor INT(6), PRIMARY KEY(StudentID)) ");
            tablecreate.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Table created and function completed");
        }
    }

    public static Connection getConnection() throws Exception {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "root";
            String password = "";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected to the MyDatabase database");
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
