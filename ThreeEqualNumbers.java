import java.util.Scanner;

public class ThreeEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Number1 = Double.parseDouble(scanner.nextLine());
        double Number2 = Double.parseDouble(scanner.nextLine());
        double Number3 = Double.parseDouble(scanner.nextLine());
        if (Number1 != Number2) {
            System.out.println("no");
        } else if (Number2 != Number3) {
            System.out.println("no");
        }
        else {
            System.out.println("yes");
            }
            }
        }
