import java.util.Scanner;

class ManufacturingController {
    // here you may declare a field
    public static String detail;
    public static int number;

    public ManufacturingController() {
    }

    public static String requestProduct(String product) {
        number++;
        // write your code here
        return number + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        // write your code here
        return number;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}