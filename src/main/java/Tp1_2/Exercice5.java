package Tp1_2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] butsParJoueur = new int[22];
        int numButeur = 0;
        int totButs = 0;
        int joueursSansButs = 0;

        for (int i = 0; i < 22; i++) {
            System.out.print("Entrez le nombre de buts inscrits par le joueur " + (i + 1) + " : ");
            butsParJoueur[i] = scanner.nextInt();
            totButs += butsParJoueur[i];
            if (butsParJoueur[i] > butsParJoueur[numButeur]) {
                numButeur = i;
            }
            if (butsParJoueur[i] == 0) {
                joueursSansButs++;
            }
        }

        System.out.println("Le buteur de l'équipe est le joueur numéro " + (numButeur + 1));
        System.out.println("Le nombre total de buts inscrits par l'équipe est : " + totButs);
        System.out.println("Le nombre de joueurs n'ayant pas marqué de but est : " + joueursSansButs);
    }

}
