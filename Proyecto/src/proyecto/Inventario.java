package proyecto;

public class Inventario {
    String producto;
    String codigo;
    String qtt;
    String precio;

    public Inventario() {
        
    }
    
    // Contructor clase
    public Inventario(String producto, String codigo, String cantidad,
            String precio) {
        this.producto = producto;
        this.codigo = codigo;
        this.qtt = cantidad;
        this.precio = precio;
    }


// Métodos SET
    public void setProducto(String producto){
        this.producto = producto;
    }
    public void setCode(String codigo) {
        this.codigo = codigo;
    }

    public void setQtt(String qtt) {
        this.qtt = qtt;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

// Métodos GET
    public String getProducto(){
        return producto;
    }
    
    public String getCode() {
        return codigo;
    }

    public String getQtt() {
        return qtt;
    }

    public String getPrecio() {
        return precio;
    }

    
    String[] getRow() {
        String [] row = new String[7];
        row[0] = producto;
        row[1] = codigo;
        row[2] = qtt;
        row[3] = precio;
        return row;
    }
    
}