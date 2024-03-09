package Tp2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer  n : ");
        int n, i, res;
        n = scanner.nextInt();
        i = 1;
        res = 1;
        if (n == 0) {
            res = 1;
        } else {

            //avec boucle while 
            while (i <= n) {
                res *= i;
                i++;
            }

            //avec boucle for
            for (i = 1; i <= n; i++) {
                res *= i;
            }
        }

        System.out.println(n + "!=" + res);
    }
}
