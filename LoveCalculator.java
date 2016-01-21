import java.util.Scanner;
public class LoveCalculator{
    public static void main(String[] args){
        System.out.println("Enter first and last name of lover one: ");
        Scanner keyboard = new Scanner(System.in);
        String loverOne = keyboard.nextLine();
        System.out.println("Enter first and last name of lover two: ");
        String loverTwo = keyboard.nextLine();
        System.out.println("Love Calculator results: ");
        int love = loverOne.length() + loverTwo.length();
        int result = love * 3;
        System.out.println(result + "%");
    }
}