import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Number = Double.parseDouble(scanner.nextLine());
        double AddBonus=0.0;
        if (Number %2 ==0) {
            AddBonus =1;
        } else if (Number %5 ==0) {
            AddBonus = 2;
        }else
            AddBonus=0;
         if(Number<100) {
            System.out.println(5+AddBonus);
            System.out.println(Number+5+AddBonus);
        } else if (Number>1000) {
            System.out.println(Number*0.10+AddBonus);
            System.out.println(Number+Number*0.10+AddBonus);
        }
        else {
            System.out.println(Number*0.20+AddBonus);
            System.out.println(Number+Number*0.20+AddBonus);
        }
    }
}
