package Trabajo_Final_Pro;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Producto> inventario;
    private List<Venta> ventas;

    public Tienda() {
        this.inventario = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
        System.out.println("Producto agregado: " + producto);
    }

    public void realizarVenta(int idProducto, int cantidad) {
        Producto producto = null;
        for (Producto p : inventario) {
            if (p.getId() == idProducto) {
                producto = p;
                break;
            }
        }
        if (producto == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        if (producto.getCantidad() < cantidad) {
            System.out.println("Cantidad insuficiente en inventario.");
            return;
        }

        producto.setCantidad(producto.getCantidad() - cantidad);
        Venta venta = new Venta(ventas.size() + 1, java.time.LocalDateTime.now().toString());
        venta.agregarProducto(producto, cantidad);
        ventas.add(venta);
        System.out.println("Venta realizada: " + venta);
    }

    public void generarInformeVentas() {
        System.out.println("Informe de Ventas:");
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }

    public void generarInformeInventario() {
        System.out.println("Informe de Inventario:");
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }
}