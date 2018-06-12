package Conditionals;

import java.util.Scanner;
/*program to keep a number from user and generates an integer between 1 and 7
and display the name of the weekday.*/

public class Question5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number:");
        int weekday = scanner.nextInt();

        switch (weekday) {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("invalid option");


        }


    }
}
