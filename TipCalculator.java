import java.util.Scanner;
import java.math.BigDecimal;
public class TipCalculator{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What was your bill?");
        double bill = keyboard.nextDouble();
        
        System.out.println("Using double for tip");
        System.out.println(bill * 1.15);
        
        System.out.println("Using float for tip");
        System.out.println(bill * 1.15f);
        
        System.out.println("Using double for tip");
        BigDecimal bill_d = new BigDecimal(bill);
        BigDecimal tip_d = new BigDecimal(1.15);
        System.out.println(bill_d.multiply(tip_d));
    }
}