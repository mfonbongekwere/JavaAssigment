package Conditionals;
import java.io.*;
import java. util. Scanner;
/*a program to read in two floating point numbers
and test if they are the same up to three decimal places
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        float a, b;

        System.out.print(  "enter a floating point number:" );
        a = scanner.nextFloat();
        System.out.println("enter second float number:");
        b = scanner.nextFloat();

        if(a>b){

            System.out.println("they are different");
        }
    }
}
