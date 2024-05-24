package Trabajo_Final_Pro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda();

        // Agregar productos iniciales
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
            System.out.println("\nSeleccione su rol:");
            System.out.println("1. Administrador");
            System.out.println("2. Vendedor");
            System.out.println("3. Gerente");
            System.out.print("Seleccione una opción: ");
            int rol = scanner.nextInt();

            switch (rol) {
                case 1:
                    menuAdministrador(scanner, tienda);
                    break;
                case 2:
                    menuVendedor(scanner, tienda);
                    break;
                case 3:
                    menuGerente(scanner, tienda);
                    break;
                default:
                    System.out.println("Rol no válido. Inténtelo de nuevo.");
            }
        }
    }

    public static void menuAdministrador(Scanner scanner, Tienda tienda) {
        while (true) {
            System.out.println("\nMenú de Administrador:");
            System.out.println("1. Agregar Nuevo Producto");
            System.out.println("2. Modificar Producto");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Realizar Venta");
            System.out.println("5. Generar Informe de Ventas");
            System.out.println("6. Generar Informe de Inventario");
            System.out.println("7. Salir");
            System.out.print("Seleccione una Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarProducto(scanner, tienda);
                    break;
                case 2:
                    modificarProducto(scanner, tienda);
                    break;
                case 3:
                    eliminarProducto(scanner, tienda);
                    break;
                case 4:
                    realizarVenta(scanner, tienda);
                    break;
                case 5:
                    tienda.generarInformeVentas();
                    break;
                case 6:
                    tienda.generarInformeInventario();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    public static void menuVendedor(Scanner scanner, Tienda tienda) {
        while (true) {
            System.out.println("\nMenú de Vendedor:");
            System.out.println("1. Ver Inventario");
            System.out.println("2. Realizar Venta");
            System.out.println("3. Salir");
            System.out.print("Seleccione una Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    tienda.generarInformeInventario();
                    break;
                case 2:
                    realizarVenta(scanner, tienda);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    public static void menuGerente(Scanner scanner, Tienda tienda) {
        while (true) {
            System.out.println("\nMenú de Gerente:");
            System.out.println("1. Ver Inventario");
            System.out.println("2. Generar Informe de Ventas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    tienda.generarInformeInventario();
                    break;
                case 2:
                    tienda.generarInformeVentas();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    public static void agregarProducto(Scanner scanner, Tienda tienda) {
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
    }

    public static void modificarProducto(Scanner scanner, Tienda tienda) {
        System.out.print("Ingrese el ID del producto a modificar: ");
        int id = scanner.nextInt();
        System.out.print("Nuevo nombre: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.print("Nuevo precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Nueva cantidad en stock: ");
        int cantidad = scanner.nextInt();

        tienda.modificarProducto(id, nombre, precio, cantidad);
    }

    public static void eliminarProducto(Scanner scanner, Tienda tienda) {
        System.out.print("Ingrese el ID del producto a eliminar: ");
        int id = scanner.nextInt();
        tienda.eliminarProducto(id);
    }

    public static void realizarVenta(Scanner scanner, Tienda tienda) {
        System.out.println("Ingrese los detalles de la venta:");
        System.out.print("ID del producto: ");
        int idProducto = scanner.nextInt();
        System.out.print("Cantidad: ");
        int cantidadVenta = scanner.nextInt();
        tienda.realizarVenta(idProducto, cantidadVenta);
    }
}