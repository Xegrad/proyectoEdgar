package proyecto;

import java.sql.*;

public class ConnectDB {

    static String bd = "ProDB";
    static String login = "root";
    static String password = "Execute55%";
    static String url = "jdbc:mysql://localhost/" + bd;

    Connection connect = null;

    public ConnectDB() {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connect = DriverManager.getConnection(url, login, password);

            if (connect != null) {
                System.out.println("Conexion exitosa");
            }
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connect;
    }

    public void desconectar() {
        connect = null;
    }

}
