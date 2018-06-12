import java.util.Scanner;

public class TODO {
    double a, b, c;
    double total ;

    public void web() {
        System.out.println("web is websome");
        Scanner input = new Scanner(System.in);


        System.out.println("enter first number:");
        a = input.nextDouble();
        System.out.println("enter second number:");
        b = input.nextDouble();
        System.out.println("enter third number:");
        c = input.nextDouble();

        double total = a + b+ c;
        System.out.println( "the total is" +total);
        double average = total/3;
        System.out.println( "the fucking average is" + average);

    }

}

