import java.util.Scanner;
public class ChangeMachine{
    public static void main(String[] args){
        System.out.println("How many pennies do you have?: ");
        Scanner keyboard = new Scanner(System.in);
        int amount = keyboard.nextInt();
        
        int quarters = amount / 25;
        amount = amount % 25;
        System.out.println(quarters + " quarters");
        
        int dimes = amount / 10;
        amount = amount % 10;
        System.out.println(dimes + " dimes");
        
        int nickels = amount / 5;
        amount = amount % 5;
        System.out.println(nickels + " nickels");
        
        int pennies = amount / 1;
        amount = amount % 1;
        System.out.println(pennies + " pennies");
    }
}