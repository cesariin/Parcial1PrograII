public class Main {


public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();

        Producto producto1 = new Producto("Camisa", 25.99, "a155", 13);
        Producto producto2 = new Producto("Pantalón", 35.50, "a156", 45);

        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        System.out.println("Total de la compra: Q" + carrito.calcularTotal());
        }
        }
