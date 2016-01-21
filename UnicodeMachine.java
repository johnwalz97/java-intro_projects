import java.util.Scanner;
public class UnicodeMachine{
    public static void main(String[] args){
        System.out.println("Enter a character to convert into Unicode");
        Scanner keyboard = new Scanner(System.in);
        char userInput = keyboard.nextLine().charAt(0);
        System.out.println("Input has unicode value of: ");
        System.out.println((int)userInput);
        char myChar = 'A';
        String myString = "A";
        System.out.println("Char can be typecasted as integer to display its Unicode value");
        System.out.println("For example 'A' has a Unicode value of: ");
        System.out.println((int)myChar);
    }
}