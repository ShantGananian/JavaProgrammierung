/*
 * Joiner
 */

/**
 *
 * @author Shant Gananian
 */
import java.util.List;

public class Joiner {

    public static void main(String[] args) {

        var result1 = join(List.of("Account", "Type", "Balance"), " --- "); // Testergebnis: hallo +++ welt +++ nachricht
        System.out.println(result1);
        var result2 = join(List.of("John", "apple"), " likes ");   // Testergebnis: John likes apple
        System.out.println(result2);
    }

    public static String join(final List<String> list, final String separator) {
        StringBuilder sb = new StringBuilder();
        /* Erstellen einer Instanz von 
        StringBuilder unter Verwendung des leeren Standardkonstruktors  */
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            /* Die append-Methode verändert das Objekt, 
            indem sie die neuen Textdaten an den internen Zustand der 
            StringBuilder-Instanz anhängt  */

            if (i < list.size() - 1) { // No separator after last occurrence
                sb.append(separator);
            }
        }

        return sb.toString();
        /* Die Methode toString() der Klasse StringBuilder 
wird verwendet, um einen String zurückzugeben, der die in einem StringBuilder-Objekt 
enthaltenen Daten darstellt  */
    }
}
