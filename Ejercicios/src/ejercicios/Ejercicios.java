/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Djmir
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int contadorWhile = 1;
        while (contadorWhile <= 10) {
            System.out.println(contadorWhile);
            contadorWhile++;
        }*/
 /* int contDoWhile = 1;
        do {
            System.out.println(contDoWhile);
            contDoWhile++;
        } while (contDoWhile <= 10); */
 /* int cont = 0;
        while (cont <= 200) {
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
            cont = cont + 1;
        } */
 /*  Scanner sc = new Scanner(System.in);
        int suma = 0;
        int producto = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            suma = suma + i;
            producto = producto * i;
        }
        System.out.println(suma);
System.out.println(producto); */
        Scanner sc = new Scanner(System.in);
        int positivo = 0;
        int negativo = 0;
        int num = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce el número: ");
            num = sc.nextInt();
            if (num >= 0) {
                System.out.println("Es un numero positivo " + num);
                positivo++;
            } else {
                System.out.println("Es un numero negativo " + num);
                negativo++;
            }

        }
        System.out.println("Hay positivos " + positivo);
        System.out.println("Hay negativos " + negativo
);
    }
}
