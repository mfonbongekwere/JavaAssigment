package Conditionals;
import java.util.Scanner;
/*write a java program to read the value of an integer m and
display the value of n is 1 when m is larger than 0,0 when m is 0
and -1 when m is less than 0*/

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m;
        int n=1;

        System.out.println("enter a number:");
        m = scanner.nextInt();

        if(m > 0){
            System.out.println("n is 1");

        }else if(m==0){
            System.out.println("n is 0");

        }else if(m<0){
            System.out.println("n is -1");
        }



    }
}
