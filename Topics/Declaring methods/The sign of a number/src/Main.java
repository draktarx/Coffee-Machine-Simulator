import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        // write your code here
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        boolean isPositive = number > 0;
        return isNegative ? -1 : isZero ? 0 : isPositive ? 1 : 99;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}