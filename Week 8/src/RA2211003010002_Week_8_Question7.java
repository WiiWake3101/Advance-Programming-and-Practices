import java.sql.*;
public class RA2211003010002_Week_8_Question7{
    public static void main(String[] args) {
        String RA2211003010002_url = "jdbc:mysql://localhost:3306/week_8";
        String RA2211003010002_username = "root";
        String RA2211003010002_password = "3101";

        try {
            Connection RA2211003010002_conn = DriverManager.getConnection(RA2211003010002_url, RA2211003010002_username, RA2211003010002_password);
            String sql = "SELECT * FROM students WHERE CGPA > ?";
            PreparedStatement RA2211003010002_pstmt = RA2211003010002_conn.prepareStatement(sql);
            RA2211003010002_pstmt.setFloat(1, 8.5f);
            ResultSet RA2211003010002_rs = RA2211003010002_pstmt.executeQuery();
            while(RA2211003010002_rs.next()) {
                System.out.println("\nRegister No: " + RA2211003010002_rs.getString("Register_no"));
                System.out.println("Name: " + RA2211003010002_rs.getString("name"));
                System.out.println("CGPA: " + RA2211003010002_rs.getFloat("CGPA"));
            }
            RA2211003010002_rs.close();
            RA2211003010002_pstmt.close();
            RA2211003010002_conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
