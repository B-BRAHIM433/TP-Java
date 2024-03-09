package Tp3;

/**
 *
 * @author B-BAYCHOU
 */
public class Exercice1 {
    public static void main(String[] args) {
        char[] voyels = {'a', 'e', 'i', 'u', 'o', 'y'};
        int i = 1;
        for (char element : voyels) {
            System.out.println("element " + i + "-->" + element);
            i++;
        }
    }
}
