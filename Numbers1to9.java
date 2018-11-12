import java.util.Scanner;

public class Numbers1to9{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int Number = Integer.parseInt(scanner.nextLine());

        if (Number == 1) {
            System.out.println("one");
        }
        else if (Number == 2) {
            System.out.println("two");
        }
        else if (Number == 3) {
            System.out.println("three");
        }
        else if (Number == 4) {
            System.out.println("four");
        }
        else if (Number == 5) {
            System.out.println("five");
        }
        else if (Number == 6) {
            System.out.println("six");
        }
        else if (Number == 7) {
            System.out.println("seven");
        }
        else if (Number == 8) {
            System.out.println("eight");
        }
        else if (Number == 9) {
            System.out.println("nine");
        }
        else {
            System.out.println("number too big");

        }

    }
}
