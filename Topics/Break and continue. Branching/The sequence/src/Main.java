import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int actualNumberInSequence = 1;
        int actualSequenceLength = 0;
        for (int i = 1; i <= n; i++, actualNumberInSequence++) {
            for (int j = 0; j < i && actualSequenceLength < n; j++, actualSequenceLength++) {
                System.out.printf("%d ", actualNumberInSequence);
            }
        }
    }
}