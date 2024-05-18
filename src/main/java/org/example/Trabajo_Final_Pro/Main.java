package Trabajo_Final_Pro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trabajo_Final_Pro.Tienda tienda = new Trabajo_Final_Pro.Tienda();


        tienda.agregarProducto(new Producto(1, "Camiseta", 10.00, 50));
        tienda.agregarProducto(new Producto(2, "Pantalones", 30.00, 40));
        tienda.agregarProducto(new Producto(3, "Zapatos", 50.00, 30));
        tienda.agregarProducto(new Producto(4, "Chaleco", 25.00, 20));
        tienda.agregarProducto(new Producto(5, "Gorra", 15.00, 10));
        tienda.agregarProducto(new Producto(6, "Bufanda", 12.00, 15));
        tienda.agregarProducto(new Producto(7, "Calcetines", 5.00, 100));
        tienda.agregarProducto(new Producto(8, "Guantes", 8.00, 25));
        tienda.agregarProducto(new Producto(9, "Falda", 20.00, 30));
        tienda.agregarProducto(new Producto(10, "Chaqueta", 40.00, 20));
        tienda.agregarProducto(new Producto(11, "Blusa", 18.00, 40));
        tienda.agregarProducto(new Producto(12, "Sombrero", 7.00, 15));
        tienda.agregarProducto(new Producto(13, "Pantuflas", 9.00, 25));
        tienda.agregarProducto(new Producto(14, "Cinturón", 6.00, 50));
        tienda.agregarProducto(new Producto(15, "Corbata", 11.00, 30));
        tienda.agregarProducto(new Producto(16, "Vestido", 35.00, 20));
        tienda.agregarProducto(new Producto(17, "Traje de baño", 28.00, 15));
        tienda.agregarProducto(new Producto(18, "Collar", 22.00, 25));
        tienda.agregarProducto(new Producto(19, "Pulsera", 14.00, 40));
        tienda.agregarProducto(new Producto(20, "Reloj", 45.00, 10));

        while (true) {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Agregar Nuevo Producto");
            System.out.println("2. Realizar Venta");
            System.out.println("3. Generar Informe de Ventas");
            System.out.println("4. Generar Informe de Inventario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los detalles del producto:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Nombre: ");
                    scanner.nextLine();
                    String nombre = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad en stock: ");
                    int cantidad = scanner.nextInt();

                    Producto nuevoProducto = new Producto(id, nombre, precio, cantidad);
                    tienda.agregarProducto(nuevoProducto);
                    break;
                case 2:
                    System.out.println("Ingrese los detalles de la venta:");
                    System.out.print("ID del producto: ");
                    int idProducto = scanner.nextInt();
                    System.out.print("Cantidad: ");
                    int cantidadVenta = scanner.nextInt();
                    tienda.realizarVenta(idProducto, cantidadVenta);
                    break;
                case 3:
                    tienda.generarInformeVentas();
                    break;
                case 4:
                    tienda.generarInformeInventario();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}
