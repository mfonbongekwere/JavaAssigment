package Conditionals;
//write a progra to solve quadratic equtions (use if ,else if ana else)
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a,b,c;
        double Root1,Root2, d;

        System.out.println("enter first number");
        a = scanner.nextInt();
        System.out.println("enter second number");
        b = scanner.nextInt();
        System.out.println("enter third number");
        c = scanner.nextInt();

        d = b * b - 4*a*c;

        if(d>0){
            Root1=(-b+Math.sqrt(d))/2*a;
            Root2 = (- b- Math.sqrt(d))/2*a;
            System.out.println("the answer of root1 is;" + Root1);
            System.out.println("the answer of root2 is:" + Root2);
        }
        else if(d==0){
            Root1=(-b+Math.sqrt(d))/2*a;
            Root2 = (- b- Math.sqrt(d))/2*a;
            System.out.println("the answer of root1 is;" + Root1);
            System.out.println("the answer of root2 is:" + Root2);
        }
        else{
            System.out.println("invalid");
        }
    }
}
