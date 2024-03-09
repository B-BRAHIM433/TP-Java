package Tp3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer N");
        int N = scanner.nextInt();
        double res = 0;
        for (int i = 1 ; i <= N; i++) {
            res += (float) 1 / i;
        }
        System.out.println("La somme est: " + res);
    }
}
