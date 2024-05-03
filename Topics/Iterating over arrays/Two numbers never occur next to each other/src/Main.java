import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Read the elements of the array
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.nextLine(); // Consume newline character

        // Read the values of n and m
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Check if n and m never occur next to each other
        boolean result = checkNMNotAdjacent(array, n, m);
        System.out.println(result);

        scanner.close();
    }

    private static boolean checkNMNotAdjacent(int[] array, int n, int m) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == n && array[i + 1] == m || array[i] == m && array[i + 1] == n) {
                return false;
            }
        }
        return true;
    }
}