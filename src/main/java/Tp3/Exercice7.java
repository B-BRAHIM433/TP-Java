package Tp3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice7 {

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
        //Calcule de Sum et moyenne
        int Sum = 0;
        for (int i : T) {
            Sum += i;
        }
        float moyen = Sum / T.length;
        int[] T2 = new int[taille];
        for (int i = 0; i < T.length; i++) {
            T2[i] = T[i];
        }
        //Affaicher Sum et Moyenne et les elements T2:
        System.out.println("la Somme des elemnets de tanlaeu est : " + Sum);
        System.out.println("la Moyenne des elemnets de tanlaeu est : " + moyen);
        for (int i : T2) {
            System.out.println(i);
        }
    }
}
