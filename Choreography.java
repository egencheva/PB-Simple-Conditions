import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Steps = Double.parseDouble(scanner.nextLine());
        double Dancers = Double.parseDouble(scanner.nextLine());
        double Days = Double.parseDouble(scanner.nextLine());
        double perDay = Math.ceil(100 / Days );
        double perDancer = (perDay / Dancers);

        if (perDay <= 13) {
            System.out.print("Yes, they will succeed in that goal! ");
            System.out.printf("%.2f", perDancer);
            System.out.print("%.");
        } else {
            System.out.print("No, They will not succeed in that goal! Required ");
            System.out.printf("%.2f", perDancer);
            System.out.print("% steps to be learned per day.");
        }
    }
}

