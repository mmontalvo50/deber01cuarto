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
// ejercicio 51 tomo1
public class InvertirNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//valores que se entren por el teclado 
        int num , numeroInvertido ,division , restoDivision;
        
        System.out.println("ingrese un numero de cuatro cifras");
        num=entrada.nextInt();
        
        numeroInvertido = 0;
        division = num ;
        restoDivision = 0 ;
        while (division !=0){
            restoDivision = division %10 ;
            division = division /10;
            numeroInvertido = numeroInvertido * 10 + restoDivision;
        }
        System.out.println("El numero"+num+"ivertido es "+numeroInvertido);
        
        }
    }
    

