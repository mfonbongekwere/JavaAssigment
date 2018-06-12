package Conditionals;
//program to display te cube of the number  up to a given integer
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("input a number:");
        num = scanner.nextInt();

        for(int x =1;x <= num; x++ ) {
            System.out.println("the number is " + x + " the cube is :" + Math.pow(x, 3));


        }
    }
}