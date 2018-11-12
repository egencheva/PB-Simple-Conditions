import java.util.Scanner;

public class ExcellentResult {
    public static void main (String [] arg){
        Scanner scanner = new Scanner (System.in);
        double Grade = Double.parseDouble(scanner.nextLine());
        if (Grade >= 5.50){
            System.out.println("Excellent!");

        }

    }
}
