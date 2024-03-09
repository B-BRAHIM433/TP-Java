package Tp2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nombre : ");
        int N = scanner.nextInt();
        int[] divs = new int[N];
        int NbrDiv = 0;
        int SumDiv = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                divs[NbrDiv] = i;
                NbrDiv++;
                SumDiv += i;
            }
        }

        System.out.println("Le nombre des diviseurs est : " + NbrDiv);
        System.out.println("La somme des diviseurs est : " + SumDiv);
        for (int i : divs) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}
