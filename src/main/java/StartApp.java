import business.CalcBusiness;
import business.CalcBusinessImpl;

import java.util.Scanner;

public class StartApp {

    public static void main(String[] args) {
        System.out.println("Hello java ji");

        //Implementing basic calculator
        System.out.println("Enter 2 no.");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        CalcBusiness calcBusiness=new CalcBusinessImpl();
        calcBusiness.calc(a,b);
    }
}
