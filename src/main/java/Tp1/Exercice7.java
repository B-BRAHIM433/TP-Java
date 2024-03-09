package Tp1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Exercice7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcule de solutions des equations ax^2+bx+c=0");
        System.out.println("Entrer a:");
        double a = scanner.nextInt();
        System.out.println("Entrer b:");
        double b = scanner.nextInt();
        System.out.println("Entrer c:");
        double c = scanner.nextInt();
        double delta = Math.pow(a, 2) - (4 * a * c);
        double x1, x2;
        if (delta == 0) {
            System.out.println("L'equation" + a + "x^2+" + b + "x+" + c + "=0 admet un seul solution reel : ");
            x1 = -b / (2 * a);
            System.out.println("x = " + x1);
        } else if (delta > 0) {
            System.out.println("L'equation" + a + "x^2+" + b + "x+" + c + "=0 admet deux solution reel : ");
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x = " + x1 + "ou x = " + x2);
        } else {
            System.out.println("L'equation" + a + "x^2+" + b + "x+" + c + "=0 admet deux solution complexe  : ");
            double re = -b / (2 * a);
            double img = Math.sqrt(Math.abs(delta)) / (2 * a);
            System.out.println("Deux solutions complexes conjugées : x1 = " + re + " + " + img + "i et x2 = " + re + " - " + img + "i");
        }
    }
}
