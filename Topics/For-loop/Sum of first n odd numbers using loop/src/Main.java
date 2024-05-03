import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer n from the user
        int n = scanner.nextInt();

        int sum = 0;

        // TODO: Write a for loop to calculate the sum of the first n positive odd numbers
        int count = 0;
        for (int i = 0; count < n; i++) {
            if (i % 2 == 0) {
                sum += n;
                count++;
            }
        }

        // Print the sum
        System.out.println(sum);
    }
}
