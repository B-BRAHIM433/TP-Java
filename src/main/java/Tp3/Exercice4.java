package Tp3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer La dimension de tableau [10, 50] ");
        int dim = scanner.nextInt();
        while (dim > 50 || dim < 10) {
            System.out.println("Svp La dimension doit etre entre 10 et 50: ");
            dim = scanner.nextInt();
        }
        int[] tab = new int[dim];
        // Remplissage 
        System.out.println("Remplissage du tableau :");
        for (int i = 0; i < tab.length; i++) {
            System.out.print("element " + (i + 1) + "--> ");
            tab[i] = scanner.nextInt();
        }
        // Affichage
        int i = 1;
        System.out.println("Affaichage des element: ");
        for (int element : tab) {
            System.out.println("element " + i + "-->" + element);
            i++;
        }
        //Supression des occurebce de 5:
        int nouvelleDim = 0;
        for (int j : tab) {
            if (j != 5) {
                nouvelleDim++;
            }
        }

        int[] nouveauTab = new int[nouvelleDim];
        int indiceNouveauTab = 0;

        for (int j : tab) {
            if (j != 5) {
                nouveauTab[indiceNouveauTab++] = j;
            }
        }
        //Affaichage de neauveau tableau
        int k = 1;
        System.out.println("Affaichage des element de nouveau tableau : ");
        for (int element : nouveauTab) {
            System.out.println("element " + k + "-->" + element);
            k++;
        }
    }
}
