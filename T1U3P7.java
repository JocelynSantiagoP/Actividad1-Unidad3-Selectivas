/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t1u3p7;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class T1U3P7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Captura compra");
        double com = sc.nextInt();
        if (com <= 500){
            System.out.println("No hay descuento, la compra es; "+com);
        } else if (com <= 1000){
            double comp = com * 5 / 100;
            double compra = com -comp;
            System.out.println("la compra es de; "+compra);
        } else if (com <=7000){
            double comp =com * 11 /100;
            double compra = com -comp;
            System.out.println("la compra es de; "+compra);
        } else if (com<=15000){
            double comp = com * 18 /100;
            double compra = com -comp;
            System.out.println("la compra es de; "+compra);
        }else{ 
            double comp = com * 25 /100;
            double compra = com -comp;
            System.out.println("la compra es de; "+compra);
        }
    }
}
