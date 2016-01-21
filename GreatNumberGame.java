import java.util.Scanner;
import java.util.Random;
public class GreatNumberGame{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int answer;
        do{
            System.out.println("Guess a number between 0-100!"); 
            answer = keyboard.nextInt();
            if(answer > randomNumber){
                System.out.println("Go lower!");
            }else if(answer < randomNumber){
                System.out.println("Go higher!");
            }
        }
        while(answer != randomNumber);
        System.out.println("You guessed correctly!");
    }
}