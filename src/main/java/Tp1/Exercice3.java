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
public class Exercice3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, temp;
        System.out.println("Entrer a: ");
        a = scanner.nextInt();
        System.out.println("Entrer b: ");
        b = scanner.nextInt();
        System.out.println("Avans permutation : \na = " + a + "\nb = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Apres permutation : \na = " + a + "\nb = " + b);

    }
}
