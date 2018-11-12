import java.util.Scanner;

public class Speed {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double Speed = Double.parseDouble(scanner.nextLine());

            if(Speed<=10) {
                System.out.println("slow");
            } else if (Speed > 10 && Speed<=50) {
                System.out.println("average");
            } else if (Speed > 50 && Speed<=150) {
                System.out.println("fast");
            }
            else if (Speed > 150 && Speed<=1000) {
                System.out.println("ultra fast");
            }
            else {
                System.out.println("extremely fast");
            }
        }
    }

