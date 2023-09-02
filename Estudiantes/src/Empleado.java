/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @version 21.06
 * @author Miroslava Ivanova,
 * <a href="mailto:miros-98@hotmail.es">miros-98@hotmail.es</a>
 */
public class Empleado /**
 * Clase Empleado Contiene informacion de cada empleado
 */
{

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    //Metodos publicos
    /**
     * Suma un plus de XX euros al salario del empleado si el empleado tiene mas
     * de ZZ años omite esta línea (sustituye la XX por tu año de nacimiento y
     * la ZZ por tu edad ) omite esta línea (Si naciste en el 80 y tu edad es de
     * 40 años sería:...) omite esta línea (Suma un plus de 80 euros al salario
     * del empleado si el empleado tiene mas de 40 años)
     *
     * @param sueldoPlus cantidad en euros que se suma al salario
     * @return <ul>
     * <li>true: se suma el plus al sueldo</li>
     * <li>false: no se suma el plus al sueldo</li>
     * </ul>
     */
    public boolean plus(double sueldoPlus) {

        boolean aumento = false;

        if (edad > 40 && compruebaNombre()) {

            salario += sueldoPlus;
            aumento = true;
        }

        return aumento;
    }
    //Metodos privados

    private boolean compruebaNombre() {
        if (nombre.equals(" ")) {
            return false;
        }
        return true;
    }
    //Constructores

    /**
     * Constructor por defecto
     */
    public Empleado() /**
     * Constructor por defecto
     */
    {
        this("", "", 0, 0);
    }

    /**
     * Constructor con 4 parametros
     *
     * @param nombre nombre del empleado
     * @param apellido nombre del empleado
     * @param edad edad del empleado
     * @param salario salrio del empleado
     */
    public Empleado(String nombre, String apellido, int edad, double salario) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
}
