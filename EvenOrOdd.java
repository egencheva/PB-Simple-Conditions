import java.util.Scanner;

public class EvenOrOdd {
    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);
        double Number = Double.parseDouble(scanner.nextLine());

        if (Number %2 ==0 ) {
            System.out.println("even");
        }
        else {
            System.out.print("odd");
        }
    }
}
