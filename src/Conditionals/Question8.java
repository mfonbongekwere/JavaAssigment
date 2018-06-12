package Conditionals;
/*A program that tells user to provide a single character from the alphabet
print vowel or consonant, depending on the user input.*/
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("input an alphabet");
        String alphabet = scanner.nextLine();

        boolean vowels = alphabet.equals("a")||alphabet.equals("e")||alphabet.equals("i")
                ||alphabet.equals("o")||alphabet.equals("u");

        if(alphabet.length()>1){
            System.out.println("invalid input");
        }else if(vowels){
            System.out.println("It's a vowel");
        }else{
            System.out.println( "Its a consonant");
        }
    }
}
