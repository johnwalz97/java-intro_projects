import java.util.Scanner;
public class IterativeSum{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Add up numbers from 1 to what number?");
        int userInput = keyboard.nextInt();
        int sum = 0;
        for(int i = 1; i <= userInput; i++){
            sum += i;
        }
        System.out.println("Adding up numbers from 1 to 5 is : " + sum);
    }
}