import java.util.Scanner;
public class CounterThree{
    public static void main(String[] args){
        int count;
        int iterator;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What number should I go up to?");
        int limit = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Odds or Evens or All? O/E/A");
        char choice = keyboard.nextLine().toUpperCase().charAt(0);
        if(choice == 'O'){
            count = 1;
            iterator = 2;
        } else if(choice == 'E'){
            count = 2;
            iterator = 2;
        } else {
            count = 1;
            iterator = 1;
        }
        while(count <= limit){
            System.out.println(count);
            count += iterator;
        }
    }
}