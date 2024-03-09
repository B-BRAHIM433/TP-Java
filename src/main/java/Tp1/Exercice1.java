package Tp1;

import java.util.Scanner;

/**
 *
 * @author B-BAYCHOU
 */
public class Exercice1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SVP entrer deux nombres: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int Somme = a + b;
        System.out.println(a + "+" + b + " = " + Somme);
        int Def = a - b;
        System.out.println(a + "-" + b + " = " + Def);
        int Produit = a * b;
        System.out.println(a + "x" + b + " = " + Produit);
        try {
            double Quot = a / b;
            System.out.println(a + "/" + b + " = " + Quot);
        } catch (Exception ex) {
            System.out.println("Division isn't possible ! please try not to divide on 0.");
        }
    }
}
