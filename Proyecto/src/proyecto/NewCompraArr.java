package proyecto;

import java.util.*;
import javax.swing.*;
import java.io.*;

public class NewCompraArr {

    private ArrayList<NewCompra> objCompra;

    // Contructor
    public NewCompraArr() {
        objCompra = new ArrayList<NewCompra>();

    }

    // Métodos de manejo del ArrayList
    public void agregar(NewCompra nc) {
        objCompra.add(nc);
    }

    public void borrar(NewCompra nc) {
        objCompra.remove(nc);
    }

    public NewCompra obtener(int pos) {
        return objCompra.get(pos);
    }

    public NewCompra buscar(String codigo) {
        for (int i = 0; i < objCompra.size(); i++) {
            if (codigo.equals(objCompra.get(i).getCode())) {
                return objCompra.get(i);
            }
        }
        return null;
    }

    public int numElementos() {
        return objCompra.size();
    }

    public void leerDatos() {
        cargar();
    }

    // Cargar lista de alumnos
    private void cargar() {
        try {

            File archivo = new File("compras.txt");
            // Si el archivo existe
            if (archivo.exists()) {
                BufferedReader bRead = new BufferedReader(new FileReader("compras.txt"));
                String linea;

                while ((linea = bRead.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String producto = st.nextToken().trim();
                    String codigo = st.nextToken().trim();
                    String qtt = st.nextToken().trim();
                    String pc = st.nextToken().trim();
                    String pv = st.nextToken().trim();
                    String proveedor = st.nextToken().trim();
                    String fecha = st.nextToken().trim();
                    NewCompra nc = new NewCompra(producto, codigo, qtt, pc, pv, proveedor, fecha);
                    agregar(nc);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e);
        }
    }

    public void guardar() {
        try {
            PrintWriter pWrite = new PrintWriter(new FileWriter("compras.txt"));
            for (int i = 0; i < numElementos(); i++) {
                pWrite.println(obtener(i).getProducto() + "," + obtener(i).getCode() + ","
                        + obtener(i).getQtt() + "," + obtener(i).getPC() + "," + obtener(i).getPV()
                        + "," + obtener(i).getProv() + "," + obtener(i).getFecha());
                pWrite.close();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e);
        }
    }
}