package Conditionals;

import java.util.Scanner;

//write a program to take three numbers from user and print the greatest number
public class Question3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.println("input first value");
         a = scanner.nextInt();
        System.out.println("input second value");
        b = scanner.nextInt();
        System.out.println("input second value");
        c = scanner.nextInt();

        if(a>b || c>b && c > a){
            System.out.println("greatest"+c);

        }else{
            System.out.println("not greater");
        }


    }
}
