package proyecto;

public class NewVenta {
    private String producto;
    private String codigo;
    private String qtt;
    private String precio;
    private String fecha;

    // Contructor clase
    public NewVenta(String producto, String codigo, String cantidad,
            String precio, String fecha) {
        this.producto = producto;
        this.codigo = codigo;
        this.qtt = cantidad;
        this.precio = precio;
        this.fecha = fecha;
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

    public void setFecha(String fecha){
        this.fecha = fecha;
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
    
    public String getFecha(){
        return fecha;
    }
}