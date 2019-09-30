public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        if (reverseNumber(number) == number) {
            return true;
        } else {
            return false;
        }

    }

    public static int reverseNumber(int num) {
        int reverse = 0;
        int lastDigit = 0;

        while (num > 0) {
            lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }

        return reverse;

    }
}
