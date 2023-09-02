
import com.sun.org.apache.xerces.internal.impl.xs.SchemaGrammar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.UIManager;
import jdk.nashorn.internal.runtime.options.Options;

public class Tiendas {

    public static void crearTienda() throws SQLException {

        CConexion conexion = new CConexion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la localización de la tienda: ");
        String localizacion = scanner.nextLine();
        System.out.println("Escribe el numero de tienda");
        int numero_tienda = scanner.nextInt();
        String nuevaTiendaSQL = "INSERT INTO mcdonalds.tiendas (localizacion, numero_tienda) VALUES(?, ?);";
        PreparedStatement statement = conexion.getConnection().prepareStatement(nuevaTiendaSQL);
        statement.setString(1, localizacion);
        statement.setInt(2, numero_tienda);
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new store has inserted successfully!Ф");
        }
    }

    public static void leerTienda() throws SQLException {
        CConexion conexion = new CConexion();
        String todasLasTiendasSQL = "SELECT idTiendas, localizacion, numero_tienda FROM mcdonalds.tiendas;";
        PreparedStatement statement = conexion.getConnection().prepareStatement(todasLasTiendasSQL);
        ResultSet todasLasTiendas = statement.executeQuery();
        System.out.println("Lista de tiendas disponibles en le BBDD");
        while (todasLasTiendas.next()) {
            System.out.println("---------------------------------------");
            System.out.print(todasLasTiendas.getInt("idTiendas") + " - ");
            System.out.print(todasLasTiendas.getString("localizacion") + " - ");
            System.out.print(todasLasTiendas.getInt("numero_tienda"));
            System.out.println("");

        }

    }

    public static void actualizarTienda() throws SQLException {
        CConexion conexion = new CConexion();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca localizacion actual");
        String localizacionVieja = scanner.nextLine();
        System.out.println("Introduzca localizacion nueva");
        String localizacionNueva = scanner.nextLine();
        String actualizarTiendaSQL = "UPDATE mcdonalds.tiendas SET localizacion=? WHERE localizacion=?;";
        PreparedStatement statement = conexion.getConnection().prepareStatement(actualizarTiendaSQL);
        statement.setString(2, localizacionVieja);
        statement.setString(1, localizacionNueva);
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Tienda actualizada exitosamente");

        } else {
            System.out.println("No se actualizo nada");
        }
    }

    public static void borrarTienda() throws SQLException {
        CConexion conexion = new CConexion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Borra tienda con localizacion: ");
        String localizacion = scanner.nextLine();
        String borrarTiendaSQL = "DELETE FROM mcdonalds.tiendas WHERE localizacion=?;";
        PreparedStatement statement = conexion.getConnection().prepareStatement(borrarTiendaSQL);
        statement.setString(1, localizacion);
        int removedTienda = statement.executeUpdate();
        System.out.println("Se ha eliminado la tienda: " + removedTienda);
    }
}
