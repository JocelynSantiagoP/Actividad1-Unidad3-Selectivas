/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t1u3p6;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class T1U3P6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Captura los numeros");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A<B && B<C){
            System.out.println("es creciente");
        } else{
            System.out.println("no es creciente");
        }
    }
}
