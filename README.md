# 🛒 Sistema ERP de Gestión de Compras

## 👥 Integrantes

- Melany Pintado
- Dayanna Chacha
- 
---

## 📝 Descripción breve del proyecto

Este proyecto consiste en el desarrollo de un sistema ERP básico para la **gestión de compras** de una organización educativa o empresarial.  
El sistema permite registrar proveedores y productos, crear solicitudes de compra por parte de los departamentos, controlar el estado de las solicitudes (SOLICITADA, EN_REVISIÓN, APROBADA, RECHAZADA) y calcular los totales de cada compra.

El sistema está estructurado siguiendo  prácticas de programación orientada a objetos en Java, aplicando separación de clases, uso de enumeraciones (`enum`) y controladores para manejar la lógica de cada entidad.

---

## 🚀 Instrucciones para ejecutar el sistema

1. **Clonar o descargar el proyecto** en tu entorno local.

2. **Abrir el proyecto** en IntelliJ IDEA.

3. **Verificar la estructura de paquetes**:
   - `ec.edu.ups.poo.clases`: contiene las clases principales (`Proveedor`, `Producto`, `Empleado`, etc.)
   - `ec.edu.ups.poo.enums`: contiene los enums `Estado` y `Rol`.
   - `ec.edu.ups.poo.controlador`: contiene las clases controladoras para manejar las operaciones.
   - `ec.edu.ups.poo.principal`: contiene la clase `Principal` que ejecuta el programa.

4. **Ejecutar la clase `Principal`**:
   - Buscar la clase `Principal` dentro del paquete `ec.edu.ups.poo.principal`.
   - Hacer clic derecho y seleccionar "Run" o "Ejecutar".

5. **Uso del sistema**:
   - A través del menú en consola, el usuario podrá:
     - Registrar nuevos proveedores, productos y solicitudes.
     - Listar todos los registros de cada tipo.
     - Buscar elementos por ID o nombre.
     - Cambiar el estado de las solicitudes.
     - Calcular totales de compra.
