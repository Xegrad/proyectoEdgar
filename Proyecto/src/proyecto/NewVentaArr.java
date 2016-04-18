package proyecto;

import java.util.*;
import javax.swing.*;
import java.io.*;

public class NewVentaArr {

    private ArrayList<NewVenta> objVenta;

    // Contructor
    public NewVentaArr() {
        objVenta = new ArrayList<NewVenta>();

    }

    // Métodos de manejo del ArrayList
    public void agregar(NewVenta nc) {
        objVenta.add(nc);
    }

    public void borrar(NewVenta nc) {
        objVenta.remove(nc);
    }

    public NewVenta obtener(int pos) {
        return objVenta.get(pos);
    }

    public NewVenta buscar(String codigo) {
        for (int i = 0; i < objVenta.size(); i++) {
            if (codigo.equals(objVenta.get(i).getCode())) {
                return objVenta.get(i);
            }
        }
        return null;
    }

    public int numElementos() {
        return objVenta.size();
    }

    public void leerDatos() {
        cargar();
    }

    // Cargar
    private void cargar() {
        try {

            File archivo = new File("ventas.txt");
            // Si el archivo existe
            if (archivo.exists()) {
                BufferedReader bRead = new BufferedReader(new FileReader("ventas.txt"));
                String linea;

                while ((linea = bRead.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String producto = st.nextToken().trim();
                    String codigo = st.nextToken().trim();
                    String qtt = st.nextToken().trim();
                    String precio = st.nextToken().trim();
                    String fecha = st.nextToken().trim();
                    NewVenta newV = new NewVenta(producto, codigo, qtt, precio, fecha);
                    agregar(newV);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e);
        }
    }

    public void guardar() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("ventas.txt"));
            for (int i = 0; i < numElementos(); i++) {
                pw.println(obtener(i).getProducto() + "," + obtener(i).getCode() + ","
                + obtener(i).getQtt() + "," + obtener(i).getPrecio() + "," + obtener(i).getFecha());
                pw.close();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e);
        }
    }
}