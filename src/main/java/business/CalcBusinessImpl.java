package business;

import business.CalcBusiness;

import java.util.Scanner;

public class CalcBusinessImpl implements CalcBusiness {

    public void calc(int a,int b){
        System.out.println("select any 1 of the options");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid input");
        }

    }

}
