
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JFrame;

public class empleadoTienda  {

    public static void añadirEmpleados() throws SQLException {
//mostrar tiendas con id 
        CConexion conexion = new CConexion();
        Tiendas.leerTienda();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elige tienda seleccionada por ID: ");
        int idTiendaSeleccionada = scanner.nextInt();

        Empleado.leerEmpleado();
        System.out.println("Elige empleado seleccionado por ID: ");
        int empleadoSeleccionado = scanner.nextInt();
//añadir nuevo empleado e indicar tienda
        String actualizaEmpleadoTiendaSQL = "UPDATE mcdonalds.empleados SET  id_tienda=? WHERE idempleados=?;";
        PreparedStatement statement = conexion.getConnection().prepareStatement(actualizaEmpleadoTiendaSQL);
        statement.setInt(1, idTiendaSeleccionada);
        statement.setInt(2, empleadoSeleccionado);
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Empleado actualizado exitosamente.");

        } else {
            System.out.println("Empleado no actualizado.");
        }

    }
}
