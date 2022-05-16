package Practica2122;

import Practica.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    public static void metodoA(){
        Connection con = ConexionBD.getConnection();

        try {
            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement("insert into customers values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            ps.setInt(1,600);
            ps.setString(2,"XXXXXXXX");
            ps.setString(3,"Negron");
            ps.setString(4,"Ivan");
            ps.setString(5,"74374378");
            ps.setString(6,"LLLLLLL");
            ps.setString(7,"HHHHHHH");
            ps.setString(8,"UUUUUUU");
            ps.setString(9,"OOOOOOO");
            ps.setString(10,"PPPPPP");
            ps.setString(11,"NNNNNNN");
            ps.setInt(12, 1286);
            ps.setDouble(13, 900.0);

            ps.executeUpdate();

            ps = con.prepareStatement("insert into products values(?,?,?,?)");
            ps.setInt(1,600);
            ps.setString(2,"YJEKAU783");
            ps.setString(3,"2010-01-01");
            ps.setInt(4,8392);

            ps.executeUpdate();

            ps = con.prepareStatement("insert into products values(?,?,?,?)");
            ps.setInt(1,600);
            ps.setString(2,"KDJASIOE873");
            ps.setString(3,"2011-02-02");
            ps.setInt(4,6785);

            ps.executeUpdate();

            con.commit();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void metodoB(){
        Connection con = ConexionBD.getConnection();

        try {
            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement("insert into offices values(?,?,?,?,?,?,?,?,?)");

            ps.setString(1,"737783");
            ps.setString(2,"JJJJJ");
            ps.setString(3,"DDDDD");
            ps.setString(4,"LLLL");
            ps.setString(5,"UUIIU");
            ps.setString(6,"JDJDK");
            ps.setString(7,"DMJDA");
            ps.setString(8,"JDJDJA");
            ps.setString(9,"DADSD");

            ps.executeUpdate();

            con.commit();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
