package proyecto;

import java.util.*;
import javax.swing.*;
import java.io.*;

public class NewUsuarioArr {

    private ArrayList<NewUsuario> objUsuario;

    // Contructor
    public NewUsuarioArr() {
        objUsuario = new ArrayList<NewUsuario>();

    }

    // Métodos de manejo del ArrayList
    public void agregar(NewUsuario newU) {
        objUsuario.add(newU);
    }

    public void borrar(NewUsuario newU) {
        objUsuario.remove(newU);
    }

    public NewUsuario obtener(int pos) {
        return objUsuario.get(pos);
    }

       public NewUsuario buscar(String userName) {
        for (int i = 0; i < objUsuario.size(); i++) {
            if (userName.equals(objUsuario.get(i).getUserName())) {
                return objUsuario.get(i);
            }
        }
        return null;
    }

    public int numElementos() {
        return objUsuario.size();
    }


    public void guardar() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("users.txt"));
            for (int i = 0; i < numElementos(); i++) {
                pw.println(obtener(i).getUserName() + "," + obtener(i).getPassword() + ","
                + obtener(i).getType() + "," + obtener(i).getName());
                pw.close();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e);
        }
    }
}