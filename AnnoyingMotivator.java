import java.util.Scanner;
public class AnnoyingMotivator{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Have you eaten your veggies? Y/N");
            String userInput = keyboard.nextLine();
            if(userInput.charAt(0) == 'y' || userInput.charAt(0) == 'Y'){
                flag = false;
            }
        }
        System.out.println("I apologize for bugging you, you'll thank me one day");
    }
}