/*
 * Gerade oder ungerade Zahl
 */

/**
 *
 * @author Shant Gananian
 */
public class GeradeOderUngeradeZahl {

    public static void main(String[] avg) {
        isEven(8);
        isOdd(9);
    }

    public static boolean isEven(final int n) {
        return n % 2 == 0; // Eine Zahl ist gerade, sofern eine Division durch 2 keinen Rest besitzt, andernfalls ist sie ungerade

    }

    public static boolean isOdd(final int n) {
        return n % 2 != 0; // Eine Zahl ist gerade, sofern eine Division durch 2 keinen Rest besitzt, andernfalls ist sie ungerade

    }
}
