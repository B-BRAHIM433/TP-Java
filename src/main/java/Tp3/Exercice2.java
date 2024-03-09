package Tp3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" declarer un tableau de 10 éléments :");
        int[] tableau = new int[10];
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Entrer l'element " + (i + 1) + ": ");
            tableau[i] = scanner.nextInt();
        }
        // Affichage
        System.out.println("les elements du tableau :");
        for (int i : tableau) {
            System.out.println(i);
        }
    }
}
