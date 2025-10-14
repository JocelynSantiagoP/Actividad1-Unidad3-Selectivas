/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t1u3p2;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class T1U3P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("captura p");
        double p = sc.nextDouble();
        System.out.println("captura q");
        double q = sc.nextDouble();
        double p3 = Math.pow(p,3);
        double q4 = Math.pow(q,4);
        double p2 = Math.pow(p,2);
        double r = p3 + q4 - 2*p2;
        if (680>=r){
            System.out.println("el valor de p es: " + p + "el valor de q es: " + q);
        }else {
            System.out.println("fin");
        }

        
       
    }
}
