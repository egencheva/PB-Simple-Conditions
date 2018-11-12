import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Time1 = Double.parseDouble(scanner.nextLine());
        double Time2 = Double.parseDouble(scanner.nextLine());
        double Time3 = Double.parseDouble(scanner.nextLine());
        double DaddyT = Double.parseDouble(scanner.nextLine());
        double TotalTime = (1 / (1 / Time1 + 1 / Time2 + 1 / Time3));
        double TTlandBreak =(TotalTime +TotalTime*0.15);
        double CheckTime = (DaddyT - TTlandBreak);
        double rounded = 0;

        if (CheckTime > 0) {
            rounded=Math.floor(CheckTime);
            System.out.print("Cleaning time: ");
            System.out.printf("%.2f", TTlandBreak);
            System.out.println("");
            System.out.print("Yes, there is a surprise - time left -> ");
            System.out.printf("%.0f", rounded);
            System.out.print(" hours.");
        } else if (CheckTime < 0) {
            rounded=Math.ceil(CheckTime*-1);
            System.out.print("Cleaning time: ");
            System.out.printf("%.2f", TTlandBreak);
            System.out.println("");
            System.out.print("No, there isn't a surprise - shortage of time -> ");
            System.out.printf("%.0f", rounded);
            System.out.print(" hours.");
        }
    }
}

