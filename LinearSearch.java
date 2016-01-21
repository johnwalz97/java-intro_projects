import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What number do you want to look for in my secret array?");
        int numToLookFor = keyboard.nextInt();
        int[] mySecretArr = new int[] {10, 23, 34, 20, 13, 8, 3, 50};
        for(int i = 0; i < mySecretArr.length; i++){
            System.out.println("Currently looking for number " + numToLookFor);
            System.out.println("and comparing with the number " + mySecretArr[i]);
            if(mySecretArr[i] == numToLookFor){
                System.out.println("FOUND THE NUMBER HERE IS THE INDEX: " + i);
                System.exit(0);
            }
            System.out.println("They are not the same, moving on to the next number");
        }
        System.out.println("Your number is not in my secret array.");
    }
}