package Tp3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" declarer la taille de tableau:");
        int N = scanner.nextInt();
        int[] T = new int[N];
        //Remplissage
        for (int i = 0; i < T.length; i++) {
            System.out.print("Entrer l'element " + (i + 1) + ": ");
            T[i] = scanner.nextInt();
        }
        // Affichage
        System.out.println("les elements du tableau :");
        for (int i : T) {
            System.out.println(i);
        }
        int debut = 0;
        int fin = T.length - 1;
        //Rangement inverse
        while (debut < fin) {
            int temp = T[debut];
            T[debut] = T[fin];
            T[fin] = temp;
            debut++;
            fin--;
        }
        System.out.println("\n\n les elements du tableau inverser :");
        for (int i : T) {
            System.out.println(i);
        }

    }
}
