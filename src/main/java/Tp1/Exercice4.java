package Tp1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entere x:");
        double x = scanner.nextDouble();
        System.out.println("Entere n:");
        int n = scanner.nextInt();
        double res = Math.pow(x, n);
        System.out.println(x + "^" + n + "=" + res);
    }
}
