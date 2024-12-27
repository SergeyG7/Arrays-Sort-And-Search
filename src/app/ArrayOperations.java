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

        for (int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();

        int left = 0, right = array.length - 1;
        int index = -1;
        while (left <= right) {   int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                index = mid;
                break;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Індекс числа " + target + " у відсортованому масиві: " + index);
        } else {
            System.out.println("Число " + target + " не знайдено в масиві.");
        }

    }

}
