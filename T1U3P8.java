/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t1u3p8;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class T1U3P8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("captura Prebas");
        double p = sc.nextDouble();
        if (p<= 20){
            System.out.println("no hay impuesto");
        } else if (p<=40){
            double PR = p * 30 /100;
            double PREBAS =  p + PR;
            System.out.println("el costo definitivo es; "+PREBAS);
        } else if (p<=500){
            double PR = p * 40 /100;
            double PREBAS = p + PR;
            System.out.println("el costo definitivo es; "+PREBAS);
        } else {
            double PR = p * 50 /100;
            double PREBAS = p + PR;
            System.out.println("el costo definitivo es; "+PREBAS);
        }
    }
}
