package Tp2;

import java.util.Scanner;

/**
 *
 * @author B-BAYCHOU
 */
public class Exercice1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer  le nombre des nombre que tu souhaite a entrer:");
        int N = scanner.nextInt();
        int i = 1;
        float Nbr;
        float Sum = 0;
        float Prod = 1;

        //avec while
        while (i <= N) {
            System.out.println("Enterer le nombre num:" + i);
            Nbr = scanner.nextFloat();
            Sum += Nbr;
            Prod *= Nbr;
            i++;
        }

        //avec do while
        do {
            System.out.println("Enterer le nombre num:" + i);
            Nbr = scanner.nextFloat();
            Sum += Nbr;
            Prod *= Nbr;
            i++;
        } while (i <= N);

        //avec for
        for (i = 1; i <= N; i++) {
            System.out.println("Enterer le nombre num:" + i);
            Nbr = scanner.nextFloat();
            Sum += Nbr;
            Prod *= Nbr;

        }

        System.out.println("La some des nomnre entrer est " + Sum);
        System.out.println("La Produit des nomnre entrer est " + Prod);
        System.out.println("La moyenne des nomnre entrer est " + Sum / N);
    }
}
