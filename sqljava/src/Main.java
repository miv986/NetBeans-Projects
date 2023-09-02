
import static java.lang.System.exit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws SQLException {

        CConexion db = new CConexion();
        db.getConnection();
        Statement statement = db.getConnection().createStatement();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        int opcion1;
        int opcion2;
        int opcion3;

        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Empleados");
            System.out.println("2. Tiendas");
            System.out.println("3. Productos");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            //EMPLEADOS
            if (opcion == 1) {
                System.out.println("Has elegido empleados. ¿Qué quieres hacer?");

                System.out.println("1. Crear");
                System.out.println("2. Leer");
                System.out.println("3. Actualizar");
                System.out.println("4. Borrar");
                System.out.println("5. Actualizar empleado");
                System.out.println("6. Actualizar producto tienda");
                opcion1 = scanner.nextInt();

                if (opcion1 == 1) {
                    Empleado.crearEmpleado();

                } else if (opcion1 == 2) {
                    Empleado.leerEmpleado();
                } else if (opcion1 == 3) {
                    Empleado.actualizarEmpleado();
                } else if (opcion1 == 4) {
                    Empleado.borrarEmpleado();
                } else if (opcion1 == 5) {
                    empleadoTienda.añadirEmpleados();
                } else {
                    productosTienda.añadirProductos();
                }
                //TIENDAS
            } else if (opcion == 2) {
                System.out.println("Has elegido tiendas. ¿Qué quieres hacer?");

                System.out.println("1. Crear");
                System.out.println("2. Leer");
                System.out.println("3. Actualizar");
                System.out.println("4. Borrar");
                opcion2 = scanner.nextInt();
                if (opcion2 == 1) {
                    Tiendas.crearTienda();
                } else if (opcion2 == 2) {
                    Tiendas.leerTienda();
                } else if (opcion2 == 3) {
                    Tiendas.actualizarTienda();
                } else {
                    Tiendas.borrarTienda();

                    //PRODUCTOS
                }
            } else if (opcion == 3) {
                System.out.println("Has elegido productos. ¿Qué quieres hacer?");

                System.out.println("1. Crear");
                System.out.println("2. Leer");
                System.out.println("3. Actualizar");
                System.out.println("4. Borrar");
                opcion3 = scanner.nextInt();
                if (opcion3 == 1) {
                    Productos.crearProductos();
                } else if (opcion3 == 2) {
                    Productos.leerProducto();
                } else if (opcion3 == 3) {
                    Productos.actualizarProducto();
                } else {
                    Productos.borrarProducto();
                }

            }

        } while (opcion != 4);
    }

}
