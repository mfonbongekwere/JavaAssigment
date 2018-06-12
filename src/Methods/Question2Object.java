package Methods;
//write a program to output the average of three input from the user.

import java.util.Scanner;

public class Question2Object{

double sum , average;
double a,b,c;
  public void Question2Object(){
      sum = a + b + c;

      Scanner scanner = new Scanner(System.in);

      System.out.println("enter first number:");
      a = scanner.nextDouble();
      System.out.println("enter second number:");
      b = scanner.nextDouble();
      System.out.println("enter third number:");
      c = scanner.nextDouble();



      }
  public void sum() {
      sum = a+b+c;
      System.out.println("the sum is " +sum);

  }
  public void average(){
      average = sum/3;
      System.out.println("the average is " +average);
  }
}















