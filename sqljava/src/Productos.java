
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JFrame;

public class Productos  {

    public static void crearProductos() throws SQLException {
        CConexion conexion = new CConexion();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce nombre del producto: ");
        String tipo = scanner.nextLine();
        System.out.println("Introduce el precio: ");
        Double precio = scanner.nextDouble();
        System.out.println("Introduce la categoria: ");
        scanner.nextLine();
        System.out.println("Introduce la cantidad: ");
        int cantidad = scanner.nextInt();
        String categoria = scanner.nextLine();
        String nuevoProductoSQL = "INSERT INTO mcdonalds.productos (tipo, precio, categoria, cantidad) VALUES (?, ?, ?)";
        PreparedStatement statement = conexion.getConnection().prepareStatement(nuevoProductoSQL);
        statement.setString(1, tipo);
        statement.setDouble(2, precio);
        statement.setString(3, categoria);
        statement.setInt(4, cantidad);

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new product was inserted successfully!Ф");
        }
    }

    public static void leerProducto() throws SQLException {
        CConexion conexion = new CConexion();

        String leerProductosQuerySQL = "SELECT * FROM mcdonalds.productos;";
        PreparedStatement statement = conexion.getConnection().prepareStatement(leerProductosQuerySQL);
        ResultSet todsLosProducots = statement.executeQuery();
        System.out.println("Lista de productos disponible en la BBDD");
        while (todsLosProducots.next()) {
            System.out.println("--------------------------------------");
            System.out.print(todsLosProducots.getString("idProductos") + " - ");
            System.out.print(todsLosProducots.getString("tipo"));
            System.out.println(todsLosProducots.getString("cantidad"));
            System.out.println("");

        }
    }

    public static void actualizarProducto() throws SQLException {
        CConexion conexion = new CConexion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca nombre de producto viejo: ");
        String nombreViejo = scanner.nextLine();
        System.out.println("Introduzca nombre de producto nuevo: ");
        String nombreNuevo = scanner.nextLine();
        String sqlUpdateProducto = "UPDATE mcdonalds.productos SET tipo=? WHERE tipo=?;";
        PreparedStatement statement = conexion.getConnection().prepareStatement(sqlUpdateProducto);
        statement.setString(2, nombreViejo);
        statement.setString(1, nombreNuevo);
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Producto actualizado exitosamente");
        } else {
            System.out.println("No se actulizó nada");
        }
    }

    public static void borrarProducto() throws SQLException {

        CConexion conexion = new CConexion();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Borra producto con nombre: ");
        String nombre = scanner.nextLine();
        String borraProductoSQL = "DELETE FROM mcdonalds.productos WHERE tipo=?;";
        PreparedStatement statement = conexion.getConnection().prepareStatement(borraProductoSQL);
        statement.setString(1, nombre);
        int removedProducts = statement.executeUpdate();
        System.out.println("Se han eliminado productos : " + removedProducts);

    }

}
