package Tp3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice3 {

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
    }
}
