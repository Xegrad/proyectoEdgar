package proyecto;

import java.util.*;
import javax.swing.*;
//import java.io.*;
import java.sql.*;

public class VentaMetodo {
// <editor-fold defaultstate="collapsed" desc="code archivos">
/* start of comment
//    private ArrayList<NewVenta> objVenta;
//
//    // Contructor
//    public VentaMetodo() {
//        objVenta = new ArrayList<NewVenta>();
//
//    }
//
//    // Métodos de manejo del ArrayList
//    public void agregar(Venta nc) {
//        objVenta.add(nc);
//    }
//
//    public void borrar(Venta nc) {
//        objVenta.remove(nc);
//    }
//
//    public Venta obtener(int pos) {
//        return objVenta.get(pos);
//    }
//
//    public Venta buscar(String codigo) {
//        for (int i = 0; i < objVenta.size(); i++) {
//            if (codigo.equals(objVenta.get(i).getCode())) {
//                return objVenta.get(i);
//            }
//        }
//        return null;
//    }
//
//    public int numElementos() {
//        return objVenta.size();
//    }
//
//    public void leerDatos() {
//        cargar();
//    }
//
//    // Cargar
//    private void cargar() {
//        try {
//
//            File archivo = new File("ventas.txt");
//            // Si el archivo existe
//            if (archivo.exists()) {
//                BufferedReader bRead = new BufferedReader(new FileReader("ventas.txt"));
//                String linea;
//
//                while ((linea = bRead.readLine()) != null) {
//                    StringTokenizer st = new StringTokenizer(linea, ",");
//                    String producto = st.nextToken().trim();
//                    String codigo = st.nextToken().trim();
//                    String qtt = st.nextToken().trim();
//                    String precio = st.nextToken().trim();
//                    String fecha = st.nextToken().trim();
//                    Venta newV = new Venta(producto, codigo, qtt, precio, fecha);
//                    agregar(newV);
//                }
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e);
//        }
//    }
//
//    public void guardar() {
//        try {
//            PrintWriter pw = new PrintWriter(new FileWriter("ventas.txt"));
//            for (int i = 0; i < numElementos(); i++) {
//                pw.println(obtener(i).getProducto() + "," + obtener(i).getCode() + ","
//                + obtener(i).getQtt() + "," + obtener(i).getPrecio() + "," + obtener(i).getFecha());
//                pw.close();
//            }
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e);
//        }
//    }
*/
// </editor-fold>
    
    
    //insertar valores a DB
     public void addVenta(Venta venta) {
        ConnectDB conn = new ConnectDB();
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO ventas VALUES('" + venta.producto + "', '" + venta.codigo+ "', '" + venta.qtt+  "','" 
                    + venta.precio+  "', '" + venta.fecha+  "')";
            
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Venta registrada");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al registrar "+e.getMessage());
        }
    }

     //obtener valores de DB
    public ArrayList<Venta> getVenta() {
        ArrayList<Venta> arrV = new ArrayList<>();
        ConnectDB conn = new ConnectDB();
        String sql = "SELECT * FROM ventas";
        try {
            PreparedStatement ps = conn.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Venta ven = new Venta(rs.getString("Producto"),rs.getString("Codigo"),rs.getString("Cantidad"),
                        rs.getString("Precio"),rs.getString("Fecha"));
                
                arrV.add(ven);
            }
            rs.close();
            ps.close();
            conn.desconectar();

        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return arrV;
    }
    
    //borrar producto de inventario con base a una venta //aun no soportado//
//    public void deleteProd(String codigo) {
//        ConnectDB conn = new ConnectDB();
//        
//        try {
//            Statement consulta = conn.getConnection().createStatement();
//            String sql = "DELETE FROM Inventario WHERE Codigo = " + codigo; 
//            
//            consulta.executeUpdate(sql);
//            JOptionPane.showMessageDialog(null,"Inventario actualizado.");
//            consulta.close();
//            conn.desconectar();
//        } catch(SQLException e) {
//            JOptionPane.showMessageDialog(null, "No se realizó la operación" + e);
//        }
//    }
    
    //actualizar valores
    public void actVenta(Venta venta) {
        ConnectDB conn = new ConnectDB();
        
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql; 
            sql = "UPDATE ventas SET Producto = '" + venta.getProducto() + "', Cantidad = '" + venta.getQtt() + "',";
            sql += " Precio = '" + venta.getPrecio()+ "', Fecha = '" + venta.getFecha()+ "' WHERE Codigo = '" + venta.getCode() + "' ";
            
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Se han guardado los cambios");
            consulta.close();
            conn.desconectar();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se guardaron los cambios " + e);
        }
    }
    
    //borrar valores 
    public void delVenta(Venta venta) {
        ConnectDB conn = new ConnectDB();
        
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "DELETE FROM ventas WHERE Codigo = '" + venta.getCode() +"',"; 
            
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Registro borrado");
            consulta.close();
            conn.desconectar();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se borro" + e);
        }
    }
}