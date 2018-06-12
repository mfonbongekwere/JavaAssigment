package Conditionals;
// program to display n terms of natural numbers and their sum
import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n,i,sum = 0;

        System.out.println("input a number:");
        n = scanner.nextInt();

        for(i=1;i<=n;i++){
            System.out.println("the nth term is: " +i);

            sum +=i;
            System.out.println("the sum is " +i);
        }


    }
}
