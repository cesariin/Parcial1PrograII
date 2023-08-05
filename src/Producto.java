class Producto {
    public String nombre;
    public double precio;
    public String codigoDeBarras;
    public int cantidadEnStock;

    public Producto(String nombre, double precio, String codigoDeBarras, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigoDeBarras = codigoDeBarras;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }
    public int getCantidadEnStock(){
        return  cantidadEnStock;
    }
}
