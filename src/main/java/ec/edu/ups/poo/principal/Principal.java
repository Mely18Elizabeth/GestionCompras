package ec.edu.ups.poo.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ec.edu.ups.poo.clases.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> productos = new ArrayList<>();
        List<Proveedor> proveedores = new ArrayList<>();
        List<Solicitud> solicitudes = new ArrayList<>();
        int opcion;

        do {
            System.out.println("===== SISTEMA DE GESTIÓN DE COMPRAS =====");
            System.out.println("1. Registrar proveedor");
            System.out.println("2. Registrar producto");
            System.out.println("3. Registrar solicitud de compra");
            System.out.println("4. Listar proveedores");
            System.out.println("5. Listar productos");
            System.out.println("6. Listar solicitudes de compra");
            System.out.println("7. Buscar proveedor por ID");
            System.out.println("8. Buscar producto por nombre");
            System.out.println("9. Buscar solicitud por número");
            System.out.println("10. Aprobar / Rechazar solicitud de compra");
            System.out.println("11. Calcular total de una solicitud");
            System.out.println("12. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Registrando proveedor...");
                    break;

                case 2:
                    System.out.print("¿Cuántos productos quieres registrar? ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("Producto #" + (i + 1));
                        System.out.print("Código: ");
                        String codigo = scanner.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Descripción: ");
                        String descripcion = scanner.nextLine();
                        System.out.print("Precio (usar coma , como separador): ");
                        double precio = scanner.nextDouble();
                        System.out.print("Cantidad: ");
                        int cantidadProducto = scanner.nextInt();
                        scanner.nextLine(); // limpiar buffer
                    }
                    break;

                case 3:
                    System.out.println("Registrando solicitud de compra...");
                    // Aquí debería ir la lógica para registrar solicitudes
                    break;

                case 4:
                    System.out.println("Listando proveedores...");
                    for (Proveedor proveedor : proveedores) {
                        System.out.println(proveedor);
                    }
                    break;

                case 5:
                    System.out.println("Listando productos...");
                    for (Producto p : productos) {
                        System.out.println(p);
                    }
                    break;

                case 6:
                    System.out.println("Listando solicitudes de compra...");
                    for (Solicitud s : solicitudes) {
                        System.out.println(s);
                    }
                    break;

                case 7:
                    System.out.print("Ingrese el ID del proveedor a buscar: ");
                    scanner.nextLine(); // limpiar buffer
                    String idProveedor = scanner.nextLine();
                    boolean proveedorEncontrado = false;
                    for (Proveedor proveedor : proveedores) {
                        if (proveedor.getId().equals(idProveedor)) {
                            System.out.println("Proveedor encontrado: " + proveedor);
                            proveedorEncontrado = true;
                            break;
                        }
                    }
                    if (!proveedorEncontrado) {
                        System.out.println("Proveedor no encontrado.");
                    }
                    break;

                case 8:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    scanner.nextLine(); // limpiar buffer
                    String nombreProductoBuscar = scanner.nextLine();
                    boolean productoEncontrado = false;
                    for (Producto producto : productos) {
                        if (producto.getNombre().equalsIgnoreCase(nombreProductoBuscar)) {
                            System.out.println("Producto encontrado: " + producto);
                            productoEncontrado = true;
                            break;
                        }
                    }
                    if (!productoEncontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 9:
                    System.out.print("Ingrese el número de solicitud a buscar: ");
                    scanner.nextLine(); // limpiar buffer
                    String numeroSolicitudBuscar = scanner.nextLine();
                    boolean solicitudEncontrada = false;
                    for (Solicitud solicitud : solicitudes) {
                        if (solicitud.getNumero().equals(numeroSolicitudBuscar)) {
                            System.out.println("Solicitud encontrada: " + solicitud);
                            solicitudEncontrada = true;
                            break;
                        }
                    }
                    if (!solicitudEncontrada) {
                        System.out.println("Solicitud no encontrada.");
                    }
                    break;

                case 10:
                    System.out.println("Aprobando / Rechazando solicitud de compra...");
                    // Lógica de aprobación/rechazo
                    break;

                case 11:
                    System.out.println("Calculando total de la solicitud...");
                    // Lógica de cálculo
                    break;

                case 12:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 12);
    }
}
