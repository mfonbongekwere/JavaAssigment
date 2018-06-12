package Conditionals;
//write a program to input 5 numbers from keyboad find their sum n average
import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       double a,b,c,d,e,f;
       double average;

        System.out.println("input first number");
        a = scanner.nextDouble();
        System.out.println("second number");
        b = scanner.nextDouble();
        System.out.println("third number");
        c= scanner.nextDouble();
        System.out.println("fouth number");
        d = scanner.nextDouble();
        System.out.println("last number");
        e = scanner.nextDouble();

     f = a + b + c + d + e;
     average = f/5;
        System.out.println("the sum of the integers are: " + f);
        System.out.println("the average is: " + average);

    }


}

