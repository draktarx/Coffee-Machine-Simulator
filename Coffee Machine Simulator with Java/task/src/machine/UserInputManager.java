package machine;

import java.util.Scanner;

public class UserInputManager {

    final Scanner scanner = new Scanner(System.in);

    String scanUserAction() {
        return scanner.nextLine().toLowerCase();
    }

    int scanUserNumber() {
        return scanner.nextInt();
    }

}
