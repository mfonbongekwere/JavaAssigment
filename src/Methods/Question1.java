package Methods;
//a method to find the smallest number among three numbers.
import java.util.Scanner;

import static Methods.Object.Smallest;

public class Question1 {
    public static void main(String[] args) {

        double a,b,c ;

        Scanner scanner = new Scanner(System.in);
        Object object = new Object();

        System.out.println("enter first number");
        a= scanner.nextDouble();
        System.out.println("enter second number:");
        b =scanner.nextDouble();
        System.out.println("enter third number:");
        c= scanner.nextDouble();
        System.out.println("the smallest value is: " + Smallest(a,b,c));






    }
}

