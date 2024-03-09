package Tp3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X, N, res, i;
        System.out.println("Entrer X");
        X = scanner.nextInt();
        System.out.println("Entrer N");
        N = scanner.nextInt();
        res = X;
        for (i = 1; i < N; i++) {
            res *= X;
        }
        System.out.println("Par multiplication succ : " + X + "^" + N + "=" + res);
    }
}
