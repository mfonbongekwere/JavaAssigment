package Conditionals;
//write to display the multiplication table of an integer
import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        System.out.println("enter a number:");
        a = scanner.nextInt();

        for(int i = 0; i <= a; i++){

            System.out.println("the multiplication table of " + a + " x " + i+ " = " +a*i);
        }
    }
}
