package Internship;
import java.util.*;
public class Task1Calculator{

    static double addition(double n1, double n2)
    {
        return n1+n2;
    }


    static double subtraction(double n1,double n2)
    {
        return n1-n2;
    }


    static double multiplication(double n1, double n2)
    {
        return n1*n2;
    }


    static double division(double n1,double n2) {
        if(n2==0)
        {
            System.out.println("Can Not Divide By Zero!");
            return 0;
        }
        else
            return n1 / n2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("*** Welcome To Our Program Based Of Simple Calculator ***");
        while(flag)
        {



            System.out.println("\nChoose Operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            int ch = sc.nextInt();

            if (ch == 5) {
                flag = false;
                break;
            }
            double n1,n2;
            System.out.print("Enter Number1 : ");
            n1 = sc.nextInt();
            System.out.print("Enter Number2 : ");
            n2 = sc.nextInt();

            switch(ch)
            {
                case 1 :
                {
                    System.out.println("Result is : "+ addition(n1,n2));
                    break;
                }
                case 2 :
                {
                    System.out.println("Result is : "+subtraction(n1,n2));
                    break;
                }
                case 3 :
                {
                    System.out.println("Result is : "+ multiplication(n1,n2));
                    break;
                }
                case 4 :
                {
                    System.out.printf("Result is : "+division((double)n1,(double)n2));
                    break;
                }
                default :
                {
                    System.out.println("Invalid Input!");
                }
            }
        }
        System.out.println("Exit Successfully...");
        sc.close();

    }
}
