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
        String sql = "insert into students values (?,?,?)";
        try {
            Connection conn = DriverManager.getConnection(url,uname,pass);
            System.out.println("Database Connected");
//            Statement st = conn.createStatement();
//            Read
//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()){
//                System.out.print(rs.getInt("sid")+"-");
//                System.out.print(rs.getString("sname")+"-");
//                System.out.println(rs.getInt("marks"));
//            }

//            Create
//            boolean status = st.execute(sql);
//            System.out.println(status);
//            Add data to backend from user input
            int sid = 101;
            String sname = "Omii";
            int marks = 86;
//            Use preparedStatement to read data
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,sid);
            st.setString(2,sname);
            st.setInt(3,marks);

            st.execute();

            conn.close();
            System.out.println("Connection Closed");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
