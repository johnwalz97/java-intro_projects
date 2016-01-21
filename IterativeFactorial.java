import java.util.Scanner;
public class IterativeFactorial{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Find factorial of what number?");
        int userInput = keyboard.nextInt();
        int factorial = 1;
        for(int i = 1; i <= userInput; i++){
            factorial *= i;
        }
        System.out.println("Factorial of 5 is : " + factorial);
    }
}