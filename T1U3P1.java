/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t1u3p1;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class T1U3P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Captura numero de sonidos emitidos");
        double N = sc.nextDouble();
        double T = N/4 +40;
        System.out.println("la temperatura es de: "+T);
        
    }
}
