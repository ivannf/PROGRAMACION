
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    public static List<ProductLine> getProductLines(){
        Connection con = ConexionBD.getConnection();
        List<ProductLine> productLines = new ArrayList<>();
        String productLine ="";
        String textDescription = "";
        String htmlDescription = "";

        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM productlines p");

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                productLine = rs.getString(1);
                textDescription = rs.getString(2);
                htmlDescription = rs.getString(3);

                productLines.add(new ProductLine(productLine,textDescription,htmlDescription));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println(productLines);
        return productLines;
    }

    public static void CategoriaMasVendida(){
        Connection con = ConexionBD.getConnection();
        String ProductLine="";

        try {
            PreparedStatement ps = con.prepareStatement("SELECT SUM(o.quantityOrdered) as total, p.productLine FROM products p inner join orderdetails o on p.productCode = o.productCode GROUP BY p.productLine ORDER BY total DESC LIMIT 1");

            ResultSet rs = ps.executeQuery();

            rs.next();

            ProductLine= rs.getString(2);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("El productLine que más ha vendido sus productos es: "+ProductLine);

    }
}
