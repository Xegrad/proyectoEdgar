package proyecto;

import java.util.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;

public class UsuarioMetodo {
//<editor-fold defaultstate="collapsed" desc=" codigo archivo ">
//    
//    private ArrayList<Usuario> objUsuario;
//
//    // Contructor
//    public UsuarioMetodo() {
//        objUsuario = new ArrayList<Usuario>();
//
//    }
//
//     
//    // Métodos de manejo del ArrayList
//    public void agregar(Usuario newU) {
//        objUsuario.add(newU);
//    }
//
//    public void borrar(Usuario newU) {
//        objUsuario.remove(newU);
//    }
//
//    public Usuario obtener(int pos) {
//        return objUsuario.get(pos);
//    }
//
//       public Usuario buscar(String userName) {
//        for (int i = 0; i < objUsuario.size(); i++) {
//            if (userName.equals(objUsuario.get(i).getUserName())) {
//                return objUsuario.get(i);
//            }
//        }
//        return null;
//    }
//
//    public int numElementos() {
//        return objUsuario.size();
//    }
//
//
//    public void guardar() {
//        try {
//            PrintWriter pw = new PrintWriter(new FileWriter("users.txt"));
//            for (int i = 0; i < numElementos(); i++) {
//                pw.println(obtener(i).getUserName() + "," + obtener(i).getPassword() + ","
//                + obtener(i).getType() + "," + obtener(i).getName());
//                pw.close();
//            }
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e);
//        }
//    }
    //</editor-fold>

    //agregar usuario
    public void agregarUsuario(Usuario us) {
        ConnectDB conn = new ConnectDB();

        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO users (nombreUs, password, cveTipo) VALUES('" + us.getUserName() + "', '"
                    + us.getPassword() + "', " + us.getTypeID() + ")";
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se ha registrado el usuario");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro el usuario " + e);
        }
    }

    //guardar usuario
    public void guardarUsuario(Usuario us) {
        ConnectDB conn = new ConnectDB();

        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql;
            sql = "UPDATE users SET nombreUs = '" + us.getUserName() + "', password = '" + us.getPassword() + "',";
            sql += " cveTipo = " + us.getTypeID() + " WHERE cveUsuario = " + us.getUserID();

            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se han guardado los cambios");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se guardaron los cambios " + e);
        }
    }

    //borrar usuario
    public void borrarUsuario(int cveUsuario) {
        ConnectDB conn = new ConnectDB();

        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "DELETE FROM users WHERE cveUsuario = " + cveUsuario;

            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "El usuario se ha borrado");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se borro el usuario " + e);
        }
    }

    //obtener usuario
    public ArrayList<Usuario> obtenUsuarios() {
        ArrayList<Usuario> arrUsuario = new ArrayList<Usuario>();
        ConnectDB conn = new ConnectDB();
        String sql = "SELECT * FROM users";

        try {
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Usuario us = new Usuario(
                        rs.getInt("cveUsuario"),
                        rs.getString("nombreUs"),
                        rs.getString("password"),
                        rs.getInt("cveTipo")
                );
                arrUsuario.add(us);
            }
            rs.close();
            st.close();
            conn.desconectar();

        } catch (Exception e) {

        }
        return arrUsuario;
    }

    public boolean logChck(String username, String password) {
        String query;
        boolean login = false;
        ConnectDB conn = new ConnectDB();
        String sql = "SELECT (nombreUs, password) FROM users";
        try {
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();

            String checkUser = rs.getString(1);
            String checkPass = rs.getString(2);

            if((checkUser.equals(username)) && (checkPass.equals(password))) {
                login = true;
            } else {
                login = false;
            }
            conn.desconectar();
        } catch (Exception err) {
            System.out.println("ERROR: " + err);
        }
        return login;
    }
}
