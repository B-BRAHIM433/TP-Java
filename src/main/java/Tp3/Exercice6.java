package Tp3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();
        int[] T = new int[taille];
        // Remplissage
        System.out.println(" saisir les elements du tableau :");
        for (int i = 0; i < T.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            T[i] = scanner.nextInt();
        }

        // Affichage 
        System.out.println("Elements du tableau :");
        for (int i = 0; i < T.length; i++) {
            System.out.println("element " + (i + 1) + ": " + T[i]);
        }
        int tailleTP = 0;
        int tailleTN = 0;
        for (int i : T) {
            if (i > 0) {
                tailleTP++;
            } else if (i < 0) {
                tailleTN++;
            }
        }
        int[] TP = new int[tailleTP];
        int[] TN = new int[tailleTN];

        int j = 0;
        int k = 0;

        // Séparation des composantes positives et négatives
        for (int i = 0; i < T.length; i++) {
            if (T[i] > 0) {
                TP[j++] = T[i];
            } else if (T[i] < 0) {
                TN[k++] = T[i];
            }
        }
        // Affichage du tableau TP
        System.out.println("Elements du tableau TP :");
        for (int i : TP) {
            System.out.println("element --> " + i);
        }

        // Affichage du tableau TN
        System.out.println("Elements du tableau TN :");
        for (int i : TN) {
            System.out.println("element --> " + i);
        }
    }
}
