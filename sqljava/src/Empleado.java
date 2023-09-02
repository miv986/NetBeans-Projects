
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JFrame;

public class Empleado {

//funciona
    public static void crearEmpleado() throws SQLException {
        CConexion conexion = new CConexion();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce DNI: ");
        String dni = scanner.nextLine();
        String nuevoEmpleadoSQL = "INSERT INTO mcdonalds.empleados (nombre, dni, id_tienda) VALUES (?, ?, 1)";
        PreparedStatement statement = conexion.getConnection().prepareStatement(nuevoEmpleadoSQL);
        statement.setString(1, nombre);
        statement.setString(2, dni);
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new user was inserted successfully!");
        }
    }

    //funciona
    public static void leerEmpleado() throws SQLException {
        CConexion conexion = new CConexion();

        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Busca usuario con el nombre: ");
        nombre = scanner.nextLine(); */
        String leerEmpleadosSQL = "SELECT idempleados, nombre, dni, id_tienda FROM mcdonalds.empleados;";
        /*WHERE nombre =?   .... se podría poner*/

        PreparedStatement statement = conexion.getConnection().prepareStatement(leerEmpleadosSQL);
        ResultSet todosLosEmpleados = statement.executeQuery();
        System.out.println("Lista de empleados disponibles en la BBDD");
        while (todosLosEmpleados.next()) {
            System.out.println("------------------------------");
            System.out.println(todosLosEmpleados.getInt("idempleados"));
            System.out.println(todosLosEmpleados.getString("nombre"));
            System.out.println(todosLosEmpleados.getString("dni"));
            System.out.println(todosLosEmpleados.getInt("id_tienda"));
        }

    }
//funciona

    public static void actualizarEmpleado() throws SQLException {
        CConexion conexion = new CConexion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce nombre actual empleado: ");
        String nombreViejo = scanner.nextLine();
        System.out.println("Introduce nombre nuevo empleado: ");
        String nombreNuevo = scanner.nextLine();
        String UpdateEmpleadoSQL = "UPDATE mcdonalds.empleados SET nombre=? WHERE nombre=?";
        PreparedStatement statement = conexion.getConnection().prepareStatement(UpdateEmpleadoSQL);
        statement.setString(2, nombreViejo);
        statement.setString(1, nombreNuevo);
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Empleado actualizado exitosamente");
        } else {
            System.out.println("No se actualizó nada");
        }
    }
//funciona

    public static void borrarEmpleado() throws SQLException {

        CConexion conexion = new CConexion();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Borra usuario con nombre: ");
        String nombre = scanner.nextLine();
        String borraEmpleadoSQL = "DELETE FROM mcdonalds.empleados WHERE nombre=?;";
        PreparedStatement statement = conexion.getConnection().prepareStatement(borraEmpleadoSQL);

        statement.setString(1, nombre);

        int removedEmpleados = statement.executeUpdate();

        System.out.println("Se ha eliminado al usuario" + removedEmpleados);

    }
}
