package proyecto;

public class Compra {
    String producto;
    String codigo;
    String qtt;
    String pc;
    String pv;
    String proveedor;
    String fecha;

    public Compra() {
        
    }
    
    // Contructor clase
    public Compra(String producto, String codigo, String cantidad,
            String pc, String pv, String proveedor, String fecha) {
        this.producto = producto;
        this.codigo = codigo;
        this.qtt = cantidad;
        this.pc = pc;
        this.pv = pv;
        this.proveedor = proveedor;
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

    public void setPC(String pc) {
        this.pc = pc;
    }

    public void setPV(String pv) {
        this.pv = pv;
    }

    public void setProv(String proveedor) {
        this.proveedor = proveedor;
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

    public String getPC() {
        return pc;
    }

    public String getPV() {
        return pv;
    }

    public String getProv() {
        return proveedor;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    String[] getRow() {
        String [] row = new String[7];
        row[0] = producto;
        row[1] = codigo;
        row[2] = qtt;
        row[3] = pc;
        row[4] = pv;
        row[5] = proveedor;
        row[6] = fecha;
        return row;
    }
    
}