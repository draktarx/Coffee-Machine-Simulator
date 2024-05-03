import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int count = scanner.nextInt();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for (int i = 0; i <= count; i++) {
            String letter = scanner.nextLine();
            if ("A".equals(letter)) { 
                countA++;
            } else if ("B".equals(letter)) {
                countB++;
            } else if ("C".equals(letter)) {
                countC++;
            } else if ("D".equals(letter)) {
                countD++;
            }
            
            /*
            The reason the literal should be on the left side of the equals comparison is to avoid 
            the possibility of an exception if the string being compared to it is null.
            https://stackoverflow.com/questions/24656018/string-literal-expressions-should-be-on-the-left-side-of-an-equals-comparison#:~:text=The%20reason%20the%20literal%20should,compared%20to%20it%20is%20null.
            */
        }

        System.out.println(countD + " " + countC + " " + countB + " " + countA);
    }
}
