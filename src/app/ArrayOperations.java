package app;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()* 100) + 1;
        }

        System.out.println("Початковий вигляд масиву: " + Arrays.toString(array));

    }

}
