
import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        long average = 0;
        int sum = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                scanner.nextLine(); // handle next line character (enter key)

                sum += number;
                counter++;
            } else {
                break;
            }
        }

        average = Math.round((double) sum / counter);

        System.out.println("SUM = " + sum + " AVG = " + average);

    }

}
