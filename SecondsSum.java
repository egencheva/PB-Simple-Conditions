import java.util.Scanner;

public class SecondsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Second1 = Double.parseDouble(scanner.nextLine());
        double Second2 = Double.parseDouble(scanner.nextLine());
        double Second3 = Double.parseDouble(scanner.nextLine());
        double Minute = 60;
        double SecInMin = (Second1 + Second2 + Second3);
        if (SecInMin < 60 && SecInMin < 10) {
             System.out.print("0:0");
             System.out.printf("%.0f", SecInMin);
        } else if (SecInMin < 60) {
            System.out.print("0:");
            System.out.printf("%.0f", SecInMin);
        } else if (SecInMin >= 60 && SecInMin < 120 && (SecInMin - 60) < 10) {
            System.out.print("1:0");
            System.out.printf("%.0f", SecInMin-60);
        }  else if (SecInMin >= 60 && SecInMin < 120) {
                System.out.print("1:");
                System.out.printf("%.0f", SecInMin-60);
        } else if (SecInMin >= 120 && SecInMin < 180 && (SecInMin - 2*60) < 10) {
            System.out.print("2:0");
            System.out.printf("%.0f", SecInMin-2*60);
        }  else if (SecInMin >= 120 && SecInMin < 180) {
            System.out.print("2:");
            System.out.printf("%.0f", SecInMin-2*60);
        } else {
        System.out.println("0");
        }
}
}

