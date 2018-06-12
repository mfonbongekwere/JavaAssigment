package Conditionals;
//program to display nterms of odd natural numbers
import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("enter an odd number:");
        int n = scanner.nextInt();

int i,sum =0;

        for(i=1;i<=n;i++){
            System.out.println(2*i-1);
            sum +=2*i-1;

        }

        System.out.println("the sum of natural number: " +n + " terms is:"+sum );
    }
}
