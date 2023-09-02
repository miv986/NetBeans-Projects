
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    public Ventana() {

        //setSize(500, 500); //Establece el tamaño de la ventana
        setTitle("Mcdonalds"); //Establece título de la ventana
        //setLocation(100, 200); //Establece la posición inicial

        setBounds(100, 200, 500, 500); //Establecemos la posición inicial y el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void iniciarComponentes() {
        JPanel panel = new JPanel();

        panel.setBackground(Color.RED); //Establecemos el color del panel
        this.getContentPane().add(panel); //Agregamos el panel a la ventana

    }

    public void colocarBotones() {
        JButton boton = new JButton();
        boton.setText("Submit");
        boton.setBounds(100, 100, 100, 40);
        boton.setEnabled(true);

    }

    private void colocarCajasTexto() {
        //JTextField cajaTexto = JTextField();
        //cajaTexto.setBounds(50, 50, 100, 30);
        //cajaTexto.setText("hola");
        
        
    }
}
