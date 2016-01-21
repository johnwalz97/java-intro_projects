import java.util.Scanner;
public class IntegerPrimitives{
    public static void main(String[] args){
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807l;
        
        System.out.println("Max value of a byte is: ");
        System.out.println(maxByte);
        System.out.println("Min value of a byte is: ");
        System.out.println(maxByte * -1 + -1);
        
        System.out.println("Max value of a short is: ");
        System.out.println(maxShort);
        System.out.println("Min value of a short is: ");
        System.out.println(maxShort * -1 + -1);
        
        System.out.println("Max value of a int is: ");
        System.out.println(maxInt);
        System.out.println("Min value of a int is: ");
        System.out.println(maxInt * -1 + -1);
        
        System.out.println("Max value of a long is: ");
        System.out.println(maxLong);
        System.out.println("Min value of a long is: ");
        System.out.println(maxLong * -1 + -1);
    }
}