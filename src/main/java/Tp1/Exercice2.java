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
public class Exercice2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final float pi = (float) 3.14;
        System.out.println("Entrer le rayon de cercle: ");
        float rayon = scanner.nextShort();
        double surface = pi * Math.pow(rayon, 2);
        float perim = 2 * pi * rayon;
        System.out.println("la surface est : " + surface + "m^2");
        System.out.println("le perimetre est : " + perim + "m");
    }
}
