package proyecto;

//import java.io.*;
//import java.util.*;
//import javax.swing.JOptionPane;

public class Usuario {

    private int cveUsuario;
    private String userName;
    private String userPass;
    private int cveTipo;

    // Constructor
    public Usuario(int idUs, String nombreUs,
            String password, int idT) {
        this.cveUsuario = idUs;
        this.userName = nombreUs;
        this.userPass = password;
        this.cveTipo = idT;
    }

    // Métodos SET
    public void setUserID(int idUs) {
        this.cveUsuario = idUs;
    }

    public void setUserName(String nombreUs) {
        this.userName = nombreUs;
    }

    public void setPassword(String password) {
        this.userPass = password;
    }

    public void setTypeID(int idT) {
        this.cveTipo = idT;
    }

    // Métodos GET
    public int getUserID() {
        return cveUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return userPass;
    }

    public int getTypeID() {
        return cveTipo;
    }

    String[] getRow() {
        String[] row = new String[3];
        row[0] = "" + cveUsuario;
        row[1] = userName;
        row[2] = "" + cveTipo;

        return row;
    }

}
