package Tp1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, res;
        System.out.println("Entrer le nombre: ");
        n = scanner.nextInt();
        res = 1;
        if (n == 0) {
            System.out.println(n + "!" + "=" + res);
        } else {
            for (int i = n; i >= 1; i--) {
                res *= i;
            }
            System.out.println(n + "!" + "=" + res);
        }

    }
}
