/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package PaqueteDaw;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class ClaseUtilidades {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int numEntero = 0; 
        
        enterosSinErrores();
        leerEnteroRango();
        comprobarEnteroRango();
        generarAleatorioRango();
    }

    public static void enterosSinErrores() {
        
        do {
            System.out.println("Introduce un numero Entero: ");
            

            try {
                numEntero = teclado.nextInt();

                System.out.println("El número es correcto: " + numEntero);

                break;
            } catch (InputMismatchException ime) {

                System.out.println("No has introducido un número entero,"
                        + "vuelve a intentarlo");

                teclado.nextLine();

            }

        } while (true);
    }

    public static void leerEnteroRango() {
        do{
         int leerRango;
         
         leerRango= teclado.nextInt();
            
        }while(true);
    }

    public static void comprobarEnteroRango() {
    }

    public static void generarAleatorioRango(int min, int max) {
        
        max++;
        Random numRandom = new Random();
        int numEntero = numRandom.nextInt(min, max);
    }
}
