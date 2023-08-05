import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<Producto> productosSeleccionados;

    public CarritoDeCompras() {
        productosSeleccionados = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productosSeleccionados.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productosSeleccionados.remove(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productosSeleccionados) {
            total += producto.getPrecio();
        }
        return total;
    }
}
