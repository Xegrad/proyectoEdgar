package proyecto;

import java.util.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;

public class InventarioMetodo {
// <editor-fold defaultstate="collapsed" desc="codigo archivos">
/* 
//    private ArrayList<NewCompra> objCompra;
//
//    // Contructor
//    public CompraMetodo() {
//        objCompra = new ArrayList<NewCompra>();
//
//    }
//
//    // Métodos de manejo del ArrayList
//    public void agregar(Compra nc) {
//        objCompra.add(nc);
//    }
//
//    public void borrar(Compra nc) {
//        objCompra.remove(nc);
//    }
//
//    public Compra obtener(int pos) {
//        return objCompra.get(pos);
//    }
//
//    public Compra buscar(String codigo) {
//        for (int i = 0; i < objCompra.size(); i++) {
//            if (codigo.equals(objCompra.get(i).getCode())) {
//                return objCompra.get(i);
//            }
//        }
//        return null;
//    }
//
//    public int numElementos() {
//        return objCompra.size();
//    }
//
//    public void leerDatos() {
//        cargar();
//    }
//
//    // Cargar lista de alumnos
//    private void cargar() {
//        try {
//
//            File archivo = new File("compras.txt");
//            // Si el archivo existe
//            if (archivo.exists()) {
//                BufferedReader bRead = new BufferedReader(new FileReader("compras.txt"));
//                String linea;
//
//                while ((linea = bRead.readLine()) != null) {
//                    StringTokenizer st = new StringTokenizer(linea, ",");
//                    String producto = st.nextToken().trim();
//                    String codigo = st.nextToken().trim();
//                    String qtt = st.nextToken().trim();
//                    String pc = st.nextToken().trim();
//                    String pv = st.nextToken().trim();
//                    String proveedor = st.nextToken().trim();
//                    String fecha = st.nextToken().trim();
//                    Compra nc = new Compra(producto, codigo, qtt, pc, pv, proveedor, fecha);
//                    agregar(nc);
//                }
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e);
//        }
//    }
//
//    public void guardar() {
//        try {
//            PrintWriter pWrite = new PrintWriter(new FileWriter("compras.txt"));
//            for (int i = 0; i < numElementos(); i++) {
//                pWrite.println(obtener(i).getProducto() + "," + obtener(i).getCode() + ","
//                        + obtener(i).getQtt() + "," + obtener(i).getPC() + "," + obtener(i).getPV()
//                        + "," + obtener(i).getProv() + "," + obtener(i).getFecha());
//                pWrite.close();
//            }
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e);
//        }
//    }
*/
// </editor-fold>
  
    
    //agregar valores con base a una compra
    public void addInv(Inventario inv) {
        ConnectDB conn = new ConnectDB();
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO inventario VALUES('" + inv.producto + "', '" + inv.codigo+ "', '" + inv.qtt+  "','" 
                    + inv.precio + "')";
            
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Inventario actualizado");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al registrar "+e.getMessage());
        }
    }
    
    //obtener valores listados en frame inventario
    public ArrayList<Inventario> getInv() {
        ArrayList<Inventario> arrP = new ArrayList<>();
        ConnectDB conn = new ConnectDB();
        String sql = "SELECT * FROM inventario";
        try {
            PreparedStatement ps = conn.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inventario inv = new Inventario(rs.getString("Producto"),rs.getString("Codigo"),rs.getString("Cantidad"),
                        rs.getString("Precio"));
                
                arrP.add(inv);
            }
            rs.close();
            ps.close();
            conn.desconectar();

        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return arrP;
    }
    
    //actualizar valores con base a actualizacion de compra
    public void actInvCompra(Inventario inv) {
        ConnectDB conn = new ConnectDB();
        
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql; 
            sql = "UPDATE inventario SET Producto = '" + inv.getProducto() + "', Cantidad = '" + inv.getQtt() + "',";
            sql +="  Precio = '" + inv.getPrecio() + "' WHERE Codigo = '" + inv.getCode() + "' ";
            
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Inventario actualizado");
            consulta.close();
            conn.desconectar();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se guardaron los cambios " + e);
        }
    }
    
    public void actInvVenta(Inventario inv) {
        ConnectDB conn = new ConnectDB();
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "UPDATE inventario SET Cantidad = '" + inv.getQtt()  + "' WHERE Codigo = "+inv.getCode();
            
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Inventario actualizado");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al registrar "+e.getMessage());
        }
    }
    
    //eliminar valores
    public void delInv(Inventario inv) {
        ConnectDB conn = new ConnectDB();
        
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "DELETE FROM inventario WHERE Codigo = '" + inv.getCode() +"' "; 
            
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Inventario actualizado");
            consulta.close();
            conn.desconectar();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar" + e);
        }
    }
    
}