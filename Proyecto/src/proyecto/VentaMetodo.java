package proyecto;

import java.util.*;
import javax.swing.*;
import java.io.*;
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
    
     public void addVenta(Venta venta) {
        ConnectDB conn = new ConnectDB();
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO ventas VALUES('" + venta.producto + "', '" + venta.codigo+ "', '" + venta.qtt+  "','" 
                    + venta.precio+  "', '" + venta.fecha+  "')";
            
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Venta ingresada");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al registrar "+e.getMessage());
        }
    }

    public ArrayList<Venta> getVenta() {
        ArrayList<Venta> arrV = new ArrayList<>();
        ConnectDB conn = new ConnectDB();
        String sql = "SELECT * FROM ventas";
        try {
            PreparedStatement ps = conn.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Venta user = new Venta(rs.getString("Producto"),rs.getString("Codigo"),rs.getString("Cantidad"),
                        rs.getString("Precio"),rs.getString("Fecha"));
                
                arrV.add(user);
            }
            rs.close();
            ps.close();
            conn.desconectar();

        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return arrV;
    }
}