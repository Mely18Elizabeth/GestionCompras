package ec.edu.ups.poo.principal;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.poo.clases.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> productos = new ArrayList<>();
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
            System.out.println("13. Aprobar / Rechazar solicitud de compra");
            System.out.println("14. Calcular total de una solicitud");
            System.out.println("15. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Registrando proveedor...");

                    break;
                case 2:
                    System.out.print("¿Cuántos productos quieres registrar? ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("Producto #" + (i + 1));
                        System.out.print("Código: ");
                        String codigo = scanner.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Descripción: ");
                        String descripcion = scanner.nextLine();
                        System.out.print("Precio(utilizar , como separador)): ");
                        double precio = scanner.nextDouble();
                        System.out.print("Cantidad: ");
                        int cantidadProducto = scanner.nextInt();
                        scanner.nextLine();

                        Producto producto = new Producto(codigo, nombre, descripcion, precio, cantidadProducto);
                        productos.add(producto);
                    }
                    break;
                case 3:
                    System.out.println("Registrando solicitud de compra...");
                    break;
                case 4:
                    System.out.println("Listando   ...");
                    break;
                case 5:
                    System.out.println("Listando productos...");
                    for (Producto p : productos) {
                        System.out.println(p);
                    }
                    break;
                case 6:
                    System.out.println("Listando solicitudes de compra...");
                    break;
                case 7:
                    System.out.print("Ingrese el ID del proveedor a buscar: ");
                    int idProveedor = scanner.nextInt();
                    boolean encontrado = false;
                    for (Producto producto : productos) { // Necesitas tener la lista 'proveedores' declarada como List<Proveedor> proveedores = new ArrayList<>();
                        if (producto.getCodigo() == idProveedor) {
                            System.out.println("Proveedor encontrado: " + idProveedor);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Proveedor no encontrado.");
                    }
                    break;

                case 8:
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Buscando solicitud por número...");
                    break;
                case 13:
                    System.out.println("Aprobando / Rechazando solicitud de compra...");
                    break;
                case 14:
                    System.out.println("Calculando total de la solicitud...");
                    break;
                case 15:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 15);
    }
}
