package Practica2122;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Consulta {

    public static void empleadosOficinaMayor(){
        Connection con = ConexionBD.getConnection();

        try {
            PreparedStatement ps = con.prepareStatement("SELECT COUNT(e.firstName) as total, o.officeCode FROM employees e inner join offices o on e.officeCode = o.officeCode group by o.officeCode ORDER BY total DESC LIMIT 1");

            ResultSet rs = ps.executeQuery();

            rs.next();

            Integer codigoOficina = rs.getInt(2);

            PreparedStatement ps2 = con.prepareStatement("SELECT * FROM employees e WHERE e.officeCode = ?");

            ps2.setInt(1,codigoOficina);

            ResultSet rs2 = ps2.executeQuery();

            while (rs2.next()){
                System.out.print(rs2.getInt(1)+" ");
                System.out.print(rs2.getString(2)+ " ");
                System.out.print(rs2.getString(3)+ " ");
                System.out.print(rs2.getString(4)+ " ");
                System.out.print(rs2.getString(5)+ " ");
                System.out.print(rs2.getString(6)+ " ");
                System.out.print(rs2.getInt(7)+ " ");
                System.out.println(rs2.getString(8));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void productosNoVendidos(){
        Connection con = ConexionBD.getConnection();

        try {
            PreparedStatement ps = con.prepareStatement("SELECT p.* FROM products p WHERE p.productCode NOT IN (SELECT o.productCode FROM orderdetails o)");

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                System.out.print(rs.getString(1)+" ");
                System.out.print(rs.getString(2)+" ");
                System.out.print(rs.getString(3)+" ");
                System.out.print(rs.getString(4)+" ");
                System.out.print(rs.getString(5)+" ");
                System.out.print(rs.getString(6)+" ");
                System.out.print(rs.getInt(7)+" ");
                System.out.print(rs.getInt(8)+" ");
                System.out.println(rs.getInt(9)+" ");

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void informeCategoria(){
        Connection con = ConexionBD.getConnection();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la categoria deseada: ");
        String categoria = sc.nextLine();

        try {
            PreparedStatement ps = con.prepareStatement("SELECT p.productName, o.quantityOrdered FROM products p inner join orderdetails o on p.productCode = o.productCode WHERE p.productLine = ?");

            ps.setString(1,categoria);

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                System.out.print(rs.getString(1)+" ");
                System.out.println(rs.getInt(2)+" ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
