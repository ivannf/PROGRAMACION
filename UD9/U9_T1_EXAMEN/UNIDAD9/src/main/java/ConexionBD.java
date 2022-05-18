
import java.sql.*;
public class ConexionBD {
    private static Connection con=null;
    public static Connection getConnection() {
        try {
            if (con == null) {
                con = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?user=root&password=root"
                        + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
                System.out.println("Conexión completada");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return (con);
    }

    public static void close(){
        try {
            if (con != null) con.close();
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
