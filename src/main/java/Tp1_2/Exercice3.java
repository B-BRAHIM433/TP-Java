package Tp1_2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier positif supérieur à 1 : ");
        int n = scanner.nextInt();
        int somme = 0;
        if (n <= 1) {
            System.out.println(n + " n'est pas un nombre parfait.");
        } else {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    somme += i;
                }
            }
            if (somme == n) {
                System.out.println(n + " est un nombre parfait.");
            } else {
                System.out.println(n + " n'est pas un nombre parfait.");
            }
        }
    }
}
