import java.util.Scanner;
import java.util.Random;
public class NinjaGold{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Integer totalGold = 0;
        String choice;
        Integer gold;
        String building;
        do{
            System.out.println("Choose Farm, Cave, House or Casino?");
            choice = keyboard.nextLine();
            char formattedChoice = choice.toUpperCase().charAt(0);
            Random rand = new Random();
            if(formattedChoice == 'F'){
                gold = rand.nextInt((20 - 10) + 1) + 10;
            }
            else if (formattedChoice == 'C' && choice.length() == 4){
                gold = rand.nextInt((10 - 5) + 1) + 5;
            }
            else if (formattedChoice == 'H'){
                gold = rand.nextInt((5 - 2) + 1) + 2;
            }
            else if (formattedChoice == 'C'){
                gold = rand.nextInt((50 - -50) + 1) + -50;
            }
            else{
                gold = null;
            }
            if(gold == null){
                System.out.println("Invalid choice pick again");
            }
            else{
                totalGold += gold;
                if(gold > 0){
                    System.out.println("You entered the " + choice + " and earned " + gold + " gold");
                    System.out.println("You currently have " + totalGold + " gold");
                } else {
                    System.out.println("You entered the casino and lost " + gold + " gold");
                    System.out.println("You currently have " + totalGold + " gold");
                }
            }
        }
        while(totalGold >= 0);
    }
}