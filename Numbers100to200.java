import java.util.Scanner;

public class Numbers100to200 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Number = Double.parseDouble(scanner.nextLine());
        if (Number < 100) {
            System.out.println("Less than 100");
        } else if (Number > 200) {
                    System.out.println("Greater than 200");
                } else {
                    System.out.println("Between 100 and 200");
                }
            }
        }