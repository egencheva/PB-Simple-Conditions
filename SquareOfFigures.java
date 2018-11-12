import java.util.Scanner;

public class SquareOfFigures {
    public static void main (String [] args){
    Scanner scanner = new Scanner (System.in);
    String Figure = scanner.nextLine();
         if (Figure.equals("square")) {
             scanner = new Scanner(System.in);
             Double A = Double.parseDouble(scanner.nextLine());
            Double Lice = A*A;
            System.out.print(Lice);
    }
    else if (Figure.equals("rectangle")) {
             scanner = new Scanner(System.in);
             Double B = Double.parseDouble(scanner.nextLine());
             Double C  = Double.parseDouble(scanner.nextLine());
            System.out.println(B * C);
        }
    else if(Figure.equals("circle ")) {
             scanner = new Scanner(System.in);
             Double D  = Double.parseDouble(scanner.nextLine());
             Double Lice = D*D;
             System.out.println(Lice);
    }
    else if(Figure.equals("triangle ")) {
             scanner = new Scanner(System.in);
             Double E  = Double.parseDouble(scanner.nextLine());
             Double F  = Double.parseDouble(scanner.nextLine());
        System.out.println(E * F);
    }
    }
}
