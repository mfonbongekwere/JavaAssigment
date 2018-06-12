//write a java program to output the number of days in a month
package Conditionals;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month,year;

        System.out.println("input a month number");
        month = scanner.nextInt();
        System.out.println("input year");
        year = scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("january " + year + " has 31 days");
                break;
            case 2:
                System.out.println("febuary "+ year + " has 29 days");
                break;
            case 3:
                System.out.println("march"+ year + " has 31 days");
                break;
            case 4:
                System.out.println("April "+year +"has 30 days");
                break;
            case 5:
                System.out.println("May" + year + " has 31 days");
                break;
            case 6:
                System.out.println("june "+ year + " has 30 days");
                break;
            case 7:
                System.out.println("july "+ year + " has 31 days");
                break;
            case 8:
                System.out.println("August "+year +"has 31 days");
                break;
            case 9:
                System.out.println("september" + year + " has 30 days");
                break;
            case 10:
                System.out.println("october "+ year + " has 31 days");
                break;
            case 11:
                System.out.println("November"+ year + " has 30 days");
                break;
            case 12:
                System.out.println("December "+year +"has 31 days");
            break;

            default:{
                System.out.println("invalid option");
            }
        }
    }
}
