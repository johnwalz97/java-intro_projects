import java.util.Scanner;
public class RecursiveFibonacci{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which fibonacci number do you want?");
        int fibNum = keyboard.nextInt();
        int myFib = recursiveFibonacci(fibNum);
        System.out.println(fibNum + "th fibonacci number is " + myFib);
    }
    public static int recursiveFibonacci(int num){
        if(num < 3){
            return 1;
        } else {
            return (recursiveFibonacci(num - 2) + recursiveFibonacci(num - 1));
        }
    }
}