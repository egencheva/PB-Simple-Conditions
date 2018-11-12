import java.util.Scanner;

public class BiggerInteger {
    public static void main (String [] arg) {
        Scanner scanner = new Scanner (System.in);
        double N1 = Double.parseDouble (scanner.nextLine());
        double N2 = Double.parseDouble (scanner.nextLine());
        if (N1>N2){
            System.out.println(N1);
        }
        else{
            System.out.println(N2);


        }

    }
}

