
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JFrame;

public class productosTienda {

    public static void añadirProductos() throws SQLException {
        //mostrar tienda por id
        CConexion conexion = new CConexion();
        Tiendas.leerTienda();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige tienda seleccionada por ID: ");
        int tiendaSeleccionada = scanner.nextInt();

        //mostrar productos disponibles en tienda seleccionada
        Productos.leerProducto();
        System.out.println("Elige producto seleccionado por ID");
        int productoSeleccionado = scanner.nextInt();

        String actualizarProductoSQL = "INSERT INTO mcdonalds.productos_tienda_mm (id_producto_mm, id_tienda_mm) VALUES(?, ?);";
        PreparedStatement statement = conexion.getConnection().prepareStatement(actualizarProductoSQL);
        statement.setInt(1, productoSeleccionado);
        statement.setInt(2, tiendaSeleccionada);
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {

            System.out.println("Producto actualizado en tienda" + tiendaSeleccionada);
        } else {
            System.out.println("Producto no actualizadoФ");
        }
    }
}
