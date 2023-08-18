/*
 * Schaltjahre
 */

/**
 *
 * @author Shant Gananian
 */

/*
Algorithmus: Berechne die Bedingungen jeweils mit Modulo-Operationen und verknüpfe diese geeignet
 */
import java.util.ArrayList;

public class Schaltjahre {

    public static void main(String[] args) {
        ArrayList<Integer> beispiel = new ArrayList();
        beispiel.add(1900);    // Beispiel; Resultat "kein Schaltjahr"
        beispiel.add(2000);    // Beispiel; Resultat "Schaltjahr"
        beispiel.add(2020);    // Beispiel; Resultat "Schaltjahr"

        for (int i = 0; i < beispiel.size(); i++) {

            if (isLeap(beispiel.get(i)) == true) {
                System.out.println(beispiel.get(i) + " ist ein Schaltjahr");
            } else {
                System.out.println(beispiel.get(i) + " ist kein Schaltjahr");
            }

        }

    }

    public static boolean isLeap(final int jahr) {
        return (jahr % 4 == 0 && (!(jahr % 100 == 0) || (jahr % 400 == 0)));
        /* Gibt true zurück, wenn die Zahl entweder durch 4 teilbar und nicht
durch 100 teilbar ist, oder wenn die Zahl durch 4 teilbar und durch 400 teilbar
ist. Andernfalls wird false zurückgegeben. */
    }

}
