import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = readIntegers(5);

        int minValue = findMin(myIntegers);

        System.out.println("Minimum value in array is " + minValue);
    }

    private static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " numbers:\r");

        int[] values = new int[count];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    private static int findMin(int[] array) {
        // Find min value in array
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
