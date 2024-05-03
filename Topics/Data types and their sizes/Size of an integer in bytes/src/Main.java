import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read in a single integer value
        int number = scanner.nextInt();

        // TODO: Print out the number of bytes used to represent the integer data type in Java
        System.out.println(Integer.SIZE / 8);
        scanner.close();
    }
}