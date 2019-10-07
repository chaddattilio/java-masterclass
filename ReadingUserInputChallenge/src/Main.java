import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter = 1;
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number #" + counter + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int newNum = scanner.nextInt();

                total += newNum;

                if (counter < 10) {
                    counter++;
                } else {
                    break;
                }

            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();

        }

        scanner.close();

        System.out.println("Total:" + total);
    }
}
