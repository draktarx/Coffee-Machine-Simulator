import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String typeOfRoom = scanner.nextLine();
        double a;
        double b;
        double c;
        double radius;
        double area;
        double pi = 3.14;
        switch (typeOfRoom) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double s = (a + b + c) / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.printf("%.20f", area);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                area = a * b;
                System.out.printf("%.20f", area);
                break;
            case "circle":
                radius = scanner.nextDouble();
                area = radius * radius * pi;
                System.out.printf("%.20f", area);
                break;
            default:
                break;
        }
        scanner.close();
    }
}
