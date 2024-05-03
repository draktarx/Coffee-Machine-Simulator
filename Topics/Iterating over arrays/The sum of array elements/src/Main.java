import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        // Problem
        final int sizeOfArray = scanner.nextInt();
        final int[] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // solution
        int sumOfArrayElements = 0;
        for (int actualElement : array)
            sumOfArrayElements += actualElement;
        System.out.println(sumOfArrayElements);
    }
}