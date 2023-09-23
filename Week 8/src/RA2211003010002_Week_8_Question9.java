import java.sql.*;
public class RA2211003010002_Week_8_Question9{
    public static void main(String[] args) {
        String RA2211003010002_url = "jdbc:mysql://localhost:3306/week_8";
        String RA2211003010002_username = "root";
        String RA2211003010002_password = "3101";
        try {
            Connection RA2211003010002_conn = DriverManager.getConnection(RA2211003010002_url, RA2211003010002_username, RA2211003010002_password);
            Statement RA2211003010002_stmt = RA2211003010002_conn.createStatement();
            ResultSet RA2211003010002_rs = RA2211003010002_stmt.executeQuery("SELECT * FROM contact_details");
            if (!RA2211003010002_rs.isBeforeFirst() ) {    
                System.out.println("No data"); 
            }
            else{
                while(RA2211003010002_rs.next()) {
                System.out.println("\nPerson Name: " + RA2211003010002_rs.getString("personName"));
                System.out.println("Contact Number: " + RA2211003010002_rs.getString("contactNumber"));
                System.out.println("Email ID: " + RA2211003010002_rs.getString("emailId"));
                }
            }
            RA2211003010002_rs.close();
            RA2211003010002_stmt.close();
            RA2211003010002_conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}