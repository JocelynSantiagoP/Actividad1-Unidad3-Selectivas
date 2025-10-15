/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t1u3p9;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class T1U3P9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Captura los numeros");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A<B){
            if (B<C){
                System.out.println("C es el mayor");
            } else {
                System.out.println("B es el mayor");
            } if (C<A){
                System.out.println("A es el mayor");
                    } else {
                System.out.println("existen dos o mas numeros iguales");
            }
        }
    }
}
