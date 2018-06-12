package Conditionals;
/*write a java program yo get a number from the user and print whether
it is positive or negative*/
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        int num = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a positve number");
        int Scanner= scanner.nextInt();

        if(num >= 1 ){
            System.out.print("positve");
            } else {
            System.out.println("negative");
        }


    }
}
