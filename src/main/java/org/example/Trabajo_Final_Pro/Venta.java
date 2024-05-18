package Trabajo_Final_Pro;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private int idVenta;
    private List<Producto> productosVendidos;
    private double total;
    private String fechaHora;

    public Venta(int idVenta, String fechaHora) {
        this.idVenta = idVenta;
        this.productosVendidos = new ArrayList<>();
        this.fechaHora = fechaHora;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        producto.setCantidad(cantidad);
        productosVendidos.add(producto);
        total += producto.getPrecio() * cantidad;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta=" + idVenta +
                ", productosVendidos=" + productosVendidos +
                ", total=" + total +
                ", fechaHora='" + fechaHora + '\'' +
                '}';
    }
}