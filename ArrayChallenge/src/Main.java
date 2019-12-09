import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        int[] mySortedIntegers = sortIntegers2(myIntegers);

        printIntegers(mySortedIntegers);

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " numbers:\r");

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    // Insertion sort
    public static int[] sortIntegers(int[] array) {
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] > array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        return array;
    }

    // Manual sorting
    public static int[] sortIntegers2(int[] array) {
        int[] sortedArray = new int[array.length];

        // Copy passed-in array to new array
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        // or alternatively to copy array:
        //int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;

    }

    public static void printIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
