import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    public static void insertarPedido(){
        Connection con = ConexionBD.getConnection();

        try {
            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement("INSERT INTO orders values(?,?,?,?,?,?,?)");

            ps.setInt(1,10426);
            ps.setString(2,"2005-06-01");
            ps.setString(3,"2005-06-20");
            ps.setString(4,null);
            ps.setString(5,"In Process");
            ps.setString(6,null);
            ps.setInt(7,282);

            ps.executeUpdate();

            ps = con.prepareStatement("INSERT INTO orderdetails values(?,?,?,?,?)");

            ps.setInt(1,10426);
            ps.setString(2,"S50_4713");
            ps.setInt(3,44);
            ps.setDouble(4,4325.0);
            ps.setInt(5,10);

            ps.executeUpdate();

            ps = con.prepareStatement("INSERT INTO orderdetails values(?,?,?,?,?)");

            ps.setInt(1,10426);
            ps.setString(2,"S12_3891");
            ps.setInt(3,32);
            ps.setDouble(4,2343.0);
            ps.setInt(5,8);

            ps.executeUpdate();

            con.commit();

        } catch (SQLException e) {
            if (con!=null){
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
