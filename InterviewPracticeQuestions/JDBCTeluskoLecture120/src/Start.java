// 1. Import packages
import java.sql.*;

public class Start {

    public static void main(String[] args) {
        /*
        Import Packages (java.sql)
        Load Drivers
        Register Driver
        Create Connection
        Create Statement
        Execute Statement
        Close Resources
        */


//       2.  Load Drivers
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
//Connection
        String url = "jdbc:postgresql://localhost:5432/TeluskoJavaLecture119";
        String uname = "postgres";
        String pass = "Satara@123";
        String sql = "select * from students";
        try {
            Connection conn = DriverManager.getConnection(url,uname,pass);
            System.out.println("Database Connected");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                System.out.print(rs.getInt("sid")+"-");
                System.out.print(rs.getString("sname")+"-");
                System.out.println(rs.getInt("marks"));
            }
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
