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
public class Problema034 {
   

   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        int a = sc.nextInt();
        if(a%2==0){
             System.out.println(a+" es par");
        }else{
            System.out.println(a+" es impar");
        }      
     }
}
    

