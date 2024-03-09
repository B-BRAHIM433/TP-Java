package Tp1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre a ");
        int a = scanner.nextInt();
        System.out.println("Entre a ");
        int b = scanner.nextInt();
        while (b
                != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("Le PGCD de ces deux nombres est : " + Math.abs(a));

    }
}
