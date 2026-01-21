/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * tipo entero que llame a
 *
 * @author USUARIO
 */
public class Ejercicio01 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = ingresarValor(entrada, "primer");
        int numero2 = ingresarValor(entrada, "segundo");
        int respuesta = sumaNumeros(numero1, numero2);
        respuestaSuma(numero1, numero2, respuesta);
    }
    public static int ingresarValor(Scanner entrada, String orden) {
        int numero = 0;
        boolean esValido = false;
        while (!esValido) {
            try {
                System.out.println("Ingrese el " + orden + " numero (entero y par):");
                numero = entrada.nextInt();

                if (numero % 2 == 0) {
                    esValido = true; 
                } else {
                    System.out.println("El numero es impar. Intenta con un par.");
                }
            } catch (InputMismatchException e) {
                System.out.println("No puedes ingresar letras! Solo numeros"
                        + " enteros.");
                entrada.next();
            }
        }
        return numero;
    }
    public static int sumaNumeros(int n1, int n2) {
        return n1 + n2;
    }
    public static void respuestaSuma(int n1, int n2, int resultado) {
        System.out.println("\nRESULTADO:");
        System.out.println(n1 + " + " + n2 + " = " + resultado);
    }
}