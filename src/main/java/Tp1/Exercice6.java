/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tp1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcule de solutions des equations ax+b=0");
        System.out.println("Entrer a:");
        int a = scanner.nextInt();
        System.out.println("Entrer b:");
        int b = scanner.nextInt();
        if (a == 0) {
            System.out.println("Error, Impossible de resoudre l'equation");
        } else {
            double res = -b / a;
            System.out.println("la solution:" + a + "x+" + b + "=0 est x = " + res);
        }
    }
}
