/*
 * Grundrechenarten
 */

/**
 *
 * @author Shant Gananian
 */
public class Grundrechenarten {

    public static void main(String[] args) {
        calc(6, 7);
        calc(3, 4);
        calc(5, 5);

    }

    public static int calc(final int m, final int n) {
        // System.out.println("Das Resultat für die Zahlen " + m + " und " + n + " ist: " + ((m * n / 2) % 7));
        return (m * n / 2) % 7;

    }
}
