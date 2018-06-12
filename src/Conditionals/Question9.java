package Conditionals;
// program to output a leap year when a particular year is being inputted by the user
import java.util.Calendar;
import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);



      System.out.println("enter a year");
      int year = scanner.nextInt();



      if( year%4 == 0 ) {

          System.out.println(year + " is a leap year");
      }
        else if(year %  100 != 0){
              System.out.println(year + " is not a leap year");
          }else{
          System.out.println("invalid");}



    }
}
