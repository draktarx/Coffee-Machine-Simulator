import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        final int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Read the elements of the array
        final int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the maximum product of two adjacent elements
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < size - 1; i++) {
            int product = array[i] * array[i + 1];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        // Output the maximum product
        System.out.println(maxProduct);

        scanner.close();
    }
}
