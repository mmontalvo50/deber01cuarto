/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.contolador;
import java.util.Scanner;
/**
 *
 * @author HOME
 */
public class Ejercicio11 {
   
    public static void main( String args[] ) { 
 
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer número: " );
        int primerNumero = teclado.nextInt();
        System.out.print( "Introduzca el segundo número: " );
        int segundoNumero = teclado.nextInt(); 
 
        System.out.print( "Su suma es: " );
        System.out.println( primerNumero+segundoNumero );
        System.out.print( "Su multiplicacion es: " );
        System.out.println( primerNumero*segundoNumero );
    }
}
 
    

