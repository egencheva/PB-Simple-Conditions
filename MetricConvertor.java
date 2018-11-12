import java.util.Scanner;

public class MetricConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Number = Double.parseDouble(scanner.nextLine());
        String In =scanner.nextLine();
        String Out =scanner.nextLine();

        double Metric = 0;
        double Metric2 = 0;

        if(In.equals ("mm") ) {
            Metric= Number/1000;
        } else if (In.equals ("km") ) {
            Metric= Number/0.001;
        } else if (In.equals ("sm") ) {
            Metric= Number/100;
        } else if (In.equals ("mi")) {
            Metric= Number/0.000621371192;
        } else if (In.equals ("inch")) {
            Metric= Number/39.3700787;
        } else if (In.equals ("ft")) {
            Metric= Number/3.2808399;
        } else if (In.equals ("yd")) {
            Metric= Number/1.0936133;
        } else if (In.equals ("m")) {
            Metric= Number/1;

        } if (Out.equals ("mm")) {
            Metric2 = Metric*1000;
        } else if (Out.equals ("km") ) {
            Metric2= Metric*0.001;
        } else if (Out.equals ("sm") ) {
            Metric2= Metric*100;
        } else if (Out.equals ("mi")) {
            Metric2= Metric*0.000621371192;
        } else if (Out.equals ("inch")) {
            Metric2= Metric*39.3700787;
        } else if (Out.equals ("ft")) {
            Metric2= Metric*3.2808399;
        } else if (Out.equals ("yd")) {
            Metric2= Metric*1.0936133;
        } else if (Out.equals ("m")) {
            Metric2= Metric*1;
        }
            System.out.printf("%.8f",Metric2);
        }
    }


