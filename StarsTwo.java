import java.util.Scanner;
public class StarsTwo{
    public static void main(String[] args){
        System.out.println("How many rows of stars do you want?");
        int limit = new Scanner(System.in).nextInt();
        int i;
        for(i = 1; i < limit; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}