/*
 * Zahlenumwandlungen
 */

/**
 *
 * @author Shant Gananian
 */
public class Zahlenumwandlungen {

    public static void main(String[] args) {

        isBinaryNumber("1001"); // Ein Beispiel, das einen booleschen Wert true zurückgibt.
    }

    public static boolean isBinaryNumber(final String input) {
        /* Die Umsetzung durchläuft den String zeichenweise vom Anfang bis zum Ende und
prüft, ob das aktuelle Zeichen 0 oder 1 ist. Wird ein anderes Zeichen erkannt,
bricht die Schleife ab und gibt false zurück
         */
        boolean isBinary = true;
        int i = 0;
        while (i < input.length() && isBinary) {
            final char currentChar = input.charAt(i);
            isBinary = (currentChar == '0' || currentChar == '1');
            i++;
        }
        // System.out.println(isBinary);
        return isBinary;
    }
}
