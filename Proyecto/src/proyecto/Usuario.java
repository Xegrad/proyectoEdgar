package proyecto;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Usuario {
    private String userName;
    private String userPass;
    private String name;
    private String userType;

    
    // Constructor
    
    public  Usuario(String nombreUsuario, String password, 
            String nombre, String tipo) {
        this.userName = nombreUsuario;
        this.userPass = password;
        this.name = nombre;        
        this.userType = tipo;
    }
    
    // Métodos SET
    
    public void setUserName(String nombreUsuario) {
        this.userName = nombreUsuario;
    }
    
    public void setPassword(String password) {
        this.userPass = password;
    }
    
    public void setName(String nombre) {
        this.name = nombre;
    }
    
    
    public void setType(String tipo) {
        this.userType = tipo;
    }
    
    // Métodos GET
    
    public String getUserName() {
        return userName;
    }
    
    public String getPassword() {
        return userPass;
    }    
    
    public String getName() {
        return name;
    }
    
    public String getType() {
        return userType;
    }
    
    // Método valida usuario
    
}
