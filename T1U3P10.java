/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t1u3p10;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class T1U3P10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("captura los minutos");
        int min = sc.nextInt();
        System.out.println("12 America N");
        System.out.println("15 America C");
        System.out.println("18 America S");
        System.out.println("19 Europa");
        System.out.println("23 Asia");
        System.out.println("25 Africa");
        System.out.println("29 Oceania");
        int clave = sc.nextInt();
        switch (clave){
            case 12:
                int Num = min*2;
                System.out.println("la clave es; "+clave+ "Num es; "+Num);
                break; 
            case 15:
                double num = min * 2.2;
                System.out.println("la clave es; "+clave+ "Num es; "+num);
                break;
            case 18:
                double N = min * 4.5;
                System.out.println("la clave es; "+clave+ "Num es; "+N);
                break;
            case 19:
                double Nm = min * 3.3;
                System.out.println("la clave es; "+clave+ "Num es; "+Nm);
                break;
            case 23:
                int Nu = min * 6;
                System.out.println("la clave es; "+clave+ "Num es; "+Nu);
                break;
            case 25:
                double N1 = min*6;
                System.out.println("la clave es; "+clave+ "Num es; "+N1);
                break;
            case 29:
                double nm = min*5;
                System.out.println("la clave es; "+clave+ "Num es; "+nm);
                break;
            default:
                System.out.println("la clave no existe");
        }
    }
}
