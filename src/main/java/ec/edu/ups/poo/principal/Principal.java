package ec.edu.ups.poo.principal;
import ec.edu.ups.poo.enums.*;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ec.edu.ups.poo.clases.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> productos = new ArrayList<>();
        List<Proveedor> proveedores = new ArrayList<>();
        List<Empleado> empleados = new ArrayList<>();
        List<Solicitud> solicitudes = new ArrayList<>();
        List<ItemSolicitud> itemsSolicitud = new ArrayList<>();
        int opcion;
        do {
            System.out.println("===== SISTEMA DE GESTIÓN DE COMPRAS =====");
            System.out.println("1. Registrar proveedor");
            System.out.println("2. Registrar producto");
            System.out.println("3. Registrar empleados");
            System.out.println("4. Registrar solicitud de compra");
            System.out.println("5. Listar proveedores");
            System.out.println("6. Listar productos");
            System.out.println("7. Listar empleados");
            System.out.println("8. Listar solicitudes de compra");
            System.out.println("9. Buscar proveedor por ID");
            System.out.println("10. Buscar producto por nombre");
            System.out.println("11. Buscar solicitud por número");
            System.out.println("12. Aprobar / Rechazar solicitud de compra");
            System.out.println("13. Calcular total de una solicitud");
            System.out.println("14. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos proveedores registrarás? ");
                    int cant1 = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < cant1; i++) {
                        System.out.println("Proveedor #" + (i + 1));
                        System.out.print("ID (entero): ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Apellido: ");
                        String apellido = scanner.nextLine();
                        System.out.print("Correo: ");
                        String correo = scanner.nextLine();
                        System.out.print("Calle principal: ");
                        String callePrincipal = scanner.nextLine();
                        System.out.print("Calle secundaria: ");
                        String calleSecundaria = scanner.nextLine();
                        System.out.print("Ciudad: ");
                        String ciudad = scanner.nextLine();
                        Direccion direccion = new Direccion(callePrincipal, calleSecundaria, ciudad);
                        List<Direccion> direcciones = new ArrayList<>();
                        direcciones.add(direccion);
                        Proveedor proveedor = new Proveedor(id, nombre, apellido, correo, direcciones);
                        proveedores.add(proveedor);
                    }
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
                        System.out.print("Precio: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Cantidad: ");
                        int cantidadProducto = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("IVA (porcentaje): ");
                        double iva = scanner.nextDouble();
                        System.out.print("Descuento (porcentaje): ");
                        double descuento = scanner.nextDouble();
                        scanner.nextLine();
                        ValoresProducto valores = new ValoresProducto(iva, descuento);
                        Producto producto = new Producto(codigo, nombre, descripcion, precio, cantidadProducto, valores);
                        productos.add(producto);
                    }
                    break;

                case 3:
                    System.out.println("cuantos empleados ingresaras");
                    int cant2 = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < cant2; i++) {
                        System.out.println("Empleado #" + (i + 1));
                        System.out.print("ID (entero): ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Apellido: ");
                        String apellido = scanner.nextLine();
                        System.out.print("Correo: ");
                        String correo = scanner.nextLine();
                        System.out.print("Calle principal: ");
                        String callePrincipal = scanner.nextLine();
                        System.out.print("Calle secundaria: ");
                        String calleSecundaria = scanner.nextLine();
                        System.out.print("Ciudad: ");
                        String ciudad = scanner.nextLine();
                        Direccion direccion = new Direccion(callePrincipal, calleSecundaria, ciudad);
                        List<Direccion> direcciones = new ArrayList<>();
                        direcciones.add(direccion);

                        System.out.println("Seleccione el rol del empleado:");
                        for (Rol rol : Rol.values()) {
                            System.out.println(rol.ordinal() + ". " + rol);
                        }
                        int opcionRol = scanner.nextInt();
                        scanner.nextLine();
                        Rol rolSeleccionado = Rol.values()[opcionRol];
                        Departamento departamento = new Departamento(rolSeleccionado);
                        Empleado empleado = new Empleado(id, nombre, apellido, correo, direcciones, departamento);
                        empleados.add(empleado);
                    }
                    break;
                case 4:
                    System.out.println("¿Cuántas solicitudes ingresarás?");
                    int cant3 = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < cant3; i++) {
                        System.out.println("Solicitud #" + (i + 1));
                        System.out.print("Número: ");
                        String numero = scanner.nextLine();
                        System.out.print("Fecha (año mes día): ");
                        int anio = scanner.nextInt();
                        int mes = scanner.nextInt() - 1;
                        int dia = scanner.nextInt();
                        scanner.nextLine();
                        GregorianCalendar fechaInicio = new GregorianCalendar(anio, mes, dia);
                        Estado estadoSeleccionado = Estado.Solicitado;
                        Solicitud solicitud = new Solicitud(numero, fechaInicio, estadoSeleccionado);
                        System.out.print("¿Cuántos productos? ");
                        int cantidadItems = scanner.nextInt();
                        scanner.nextLine();
                        for (int j = 0; j < cantidadItems; j++) {
                            System.out.print("Cantidad del producto: ");
                            double cantidadSolicitada = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Seleccione el producto (número): ");
                            int productoSeleccionado = scanner.nextInt();
                            scanner.nextLine();
                            Producto productoSeleccionadoObj = productos.get(productoSeleccionado);

                            if (productoSeleccionadoObj != null && productoSeleccionadoObj.getCantidad() >= cantidadSolicitada) {
                                productoSeleccionadoObj.setCantidad(productoSeleccionadoObj.getCantidad() - (int) cantidadSolicitada);
                                solicitud.getItems().add(new ItemSolicitud(cantidadSolicitada, productoSeleccionadoObj));
                                System.out.println("Producto agregado.");
                            } else {
                                System.out.println("Cantidad insuficiente o producto no válido.");
                                j--;
                            }
                        }
                        solicitudes.add(solicitud);
                        System.out.println("Solicitud registrada.");
                    }
                    break;


                case 5:
                    System.out.println("Listando proveedores");
                    for (Proveedor proveedor : proveedores) {
                        System.out.println(proveedor);
                    }
                    break;
                case 6:
                    System.out.println("Listando productos");
                    for (Producto p : productos) {
                        System.out.println(p);
                    }
                    break;

                case 7:
                    System.out.println("Listando empleados");
                    for (Empleado empleado : empleados) {
                        System.out.println(empleado);
                    }
                    break;

                case 8:
                    System.out.println("Lista de Solicitudes:");
                    for (Solicitud solicitud : solicitudes) {
                        System.out.println(solicitud);
                        System.out.println("  Items de la solicitud:");
                        for (ItemSolicitud item : itemsSolicitud) {
                            System.out.println(item);
                            }
                        }
                    break;
                case 9:
                    System.out.print("Ingrese el ID del proveedor a buscar: ");
                    int idBuscado = scanner.nextInt();
                    scanner.nextLine();
                    boolean encontrado = false;
                    for (Proveedor proveedor : proveedores) {
                        if (proveedor.getId() == idBuscado) {
                            System.out.println("Proveedor encontrado: ");
                            System.out.println(proveedor);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Proveedor con ID " + idBuscado + " no encontrado.");
                    }
                    break;

                case 10:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    scanner.nextLine();
                    String nombreBuscado = scanner.nextLine();
                    nombreBuscado = nombreBuscado.toLowerCase();
                    boolean productoEncontrado = false;
                    for (Producto producto : productos) {
                        if (producto.getNombre().toLowerCase().equals(nombreBuscado)) {
                            System.out.println("Producto encontrado: ");
                            System.out.println(producto);
                            productoEncontrado = true;
                            break;
                        }
                    }
                    if (!productoEncontrado) {
                        System.out.println("Producto con nombre \"" + nombreBuscado + "\" no encontrado.");
                    }
                    break;

                case 11:
                    System.out.print("Ingrese el número de solicitud a buscar: ");
                    scanner.nextLine();
                    String numeroSolicitudBuscada = scanner.nextLine();
                    boolean solicitudEncontrada = false;
                    for (Solicitud solicitud : solicitudes) {
                        if (solicitud.getNumero().equals(numeroSolicitudBuscada)) {
                            System.out.println("Solicitud encontrada: ");
                            System.out.println(solicitud);
                            System.out.println("  Items de la solicitud:");
                            for (ItemSolicitud item : itemsSolicitud) {
                                System.out.println(item);
                            }
                            solicitudEncontrada = true;
                            break;
                        }
                    }
                    if (!solicitudEncontrada) {
                        System.out.println("Solicitud con número \"" + numeroSolicitudBuscada + "\" no encontrada.");
                    }

                    break;

                case 12:
                    System.out.print("Ingrese el número de solicitud a aprobar o rechazar: ");
                    scanner.nextLine();
                    String numSolic = scanner.nextLine();
                    boolean solicitudEncontradaParaAprobar = false;
                    for (Solicitud solicitud : solicitudes) {
                        if (solicitud.getNumero().equals(numSolic)) {
                            System.out.println("Solicitud encontrada: ");
                            System.out.println(solicitud);
                            System.out.println("¿Desea aprobar o rechazar esta solicitud?");
                            System.out.println("1. Aprobar");
                            System.out.println("2. Rechazar");
                            System.out.print("Seleccione una opción: ");
                            int opcionAprobacion = scanner.nextInt();
                            scanner.nextLine();
                            if (opcionAprobacion == 1) {
                                solicitud.setEstado(Estado.Aprobado);
                                System.out.println("Solicitud aprobada.");
                            } else if (opcionAprobacion == 2) {
                                solicitud.setEstado(Estado.Rechazado);
                                System.out.println("Solicitud rechazada.");
                            } else {
                                System.out.println("Opción inválida.");
                            }
                            solicitudEncontradaParaAprobar = true;
                            break;
                        }
                    }

                    if (!solicitudEncontradaParaAprobar) {
                        System.out.println("Solicitud con número \"" + numSolic + "\" no encontrada.");
                    }
                    break;

                case 13:
                    System.out.print("Ingrese el número de solicitud para calcular el total: ");
                    scanner.nextLine();
                    String numSolicitud = scanner.nextLine();
                    boolean sols = false;

                    for (Solicitud solicitud : solicitudes) {
                        if (solicitud.getNumero().equals(numSolicitud)) {
                            double totalSolicitud = 0;
                            for (ItemSolicitud item : solicitud.getItems()) {
                                Producto producto = item.getProducto();
                                double precioTotal = producto.getPrecio() * item.getCantidad();
                                double ivaTotal = precioTotal * producto.getValores().getIva() / 100;
                                double descuentoTotal = precioTotal * producto.getValores().getDescuento() / 100;
                                totalSolicitud += precioTotal + ivaTotal - descuentoTotal;
                            }
                            System.out.println("Total de la solicitud: " + totalSolicitud);
                            solicitudEncontrada = true;
                            break;
                        }
                    }
                    if (!sols) {
                        System.out.println("Solicitud no encontrada.");
                    }
                    break;
                case 14:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 14);
    }
}
