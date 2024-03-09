package Tp1_2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entere le nomnre : ");
        int n = scanner.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int m = scanner.nextInt();

        int sommeN = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sommeN += i;
            }
        }

        int sommeM = 1;
        for (int i = 2; i <= m / 2; i++) {
            if (m % i == 0) {
                sommeM += i;
            }
        }

        if (sommeN == m && sommeM == n) {
            System.out.println(n + " et " + m + " sont des nombres amis.");
        } else {
            System.out.println(n + " et " + m + " ne sont pas des nombres amis.");

        }
    }
}
