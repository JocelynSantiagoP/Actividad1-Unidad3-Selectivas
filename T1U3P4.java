/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t1u3p4;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class T1U3P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Captura un numero");
        double N = sc.nextDouble();
        if (N<0){
            System.out.println("es negativo");
        }else if (N==0) {
            System.out.println("es nulo");
        } else if (N>0)
            System.out.println("es positivo");
    }
}
