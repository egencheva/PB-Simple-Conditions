import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Word1 = scanner.nextLine();
        String Word2 = scanner.nextLine();

        if(Word1.equalsIgnoreCase(Word2)) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}

