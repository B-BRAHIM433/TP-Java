package Tp2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer l'heure [0,23]");
        int heure;
        int minute;
        do {
            heure = scanner.nextInt();
        } while (heure > 24 || heure < 0);
        System.out.println("Entrer la minute [0,59]");
        do {
            minute = scanner.nextInt();
        } while (minute > 59 || minute < 0);
        minute++;
        if (heure == 23 && minute == 60) {
            heure = 00;
        }
        if (minute == 60) {
            minute = 00;
        }

        System.out.println("l'heure: "+heure + ":" + minute);
    }
}
