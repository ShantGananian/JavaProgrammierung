/*
 * Fibonacci rekursiv
 */

/**
 *
 * @author Shant Gananian
 */
public class FibonacciRekursiv {

    public static void main(String[] avg) {
        fibRec(6);
        //System.out.println(fibRec(6));
    }

    public static long fibRec(final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be >=1");
            // System.out.println("n muss >= 1 sein");
        }

        // rekursiver Abbruch
        if (n == 1 || n == 2) {
            return 1;
        }

        // rekursiver Abstieg
        return fibRec(n - 1) + fibRec(n - 2);

    }

}
