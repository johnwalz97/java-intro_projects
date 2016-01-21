import java.util.Scanner;
public class Greeter{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String FirstName = keyboard.nextLine();
        System.out.println("Enter your last name:");
        String LastName = keyboard.nextLine();
        System.out.println("Your Korean name is: " + LastName + " " + FirstName);
    }
}