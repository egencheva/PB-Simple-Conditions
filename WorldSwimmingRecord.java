import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double RecordSec = Double.parseDouble(scanner.nextLine());
        double DistanceM = Double.parseDouble(scanner.nextLine());
        double TimeSec = Double.parseDouble(scanner.nextLine());
        double Time =DistanceM * TimeSec +Math.floor(DistanceM / 15) * 12.5;
        double TimeRecord = (Time-RecordSec);
        if (Time > RecordSec) {
            System.out.print("No, he failed! He was ");
            System.out.printf("%.2f", TimeRecord);
            System.out.print(" seconds slower.");
        } else {
            System.out.print("Yes, he succeeded! The new world record is ");
            System.out.printf("%.2f", Time);
            System.out.print(" seconds.");
        }
    }
}
