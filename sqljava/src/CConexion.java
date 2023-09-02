
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CConexion {

    private static String driver = "com.mysql.jdbc.Driver";
    private static String usuario = "root";
    private static String contraseña = "1234";
    private static String url = "jdbc:mysql://localhost:3306/";

    public Connection getConnection() {

        Connection con = null;
        try {
            con = DriverManager.getConnection(url, usuario, contraseña);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion fallida" + e);
        }
        return con;
    }
}
