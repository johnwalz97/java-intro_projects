import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is the first number?: ");
        int first_num = keyboard.nextInt();
        
        System.out.println("What is the second number?: ");
        int second_num = keyboard.nextInt();
        
        System.out.println("The sum of the two numbers is: " + (first_num + second_num));
    }
}