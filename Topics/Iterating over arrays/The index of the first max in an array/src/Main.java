import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        // Read problem
        final int numberOfElements = scanner.nextInt();
        final int[] array = new int[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Solve the problem
        int indexOfTheFirstMax = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfTheFirstMax = i;
            }
        }

        System.out.println(indexOfTheFirstMax);

    }
}