/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t1u3p5;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class T1U3P5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("captura A");
        int A = sc.nextInt();
        if (A==0){
            System.out.println("A es nulo");
        } else if (A%2==0){
            System.out.println("A es par");
        } else {
            System.out.println("A es impar");
        }
    }
}
