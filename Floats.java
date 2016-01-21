import java.math.BigDecimal;
public class Floats{
    public static void main(String[] args){
        float f1 = 1.0f/3;
        double f2 = 1.0/3;
        System.out.println("Float");
        System.out.println(f1);
        System.out.println("Double");
        System.out.println(f2);
        
        boolean b1 = (0.1 == 0.1);
        boolean b2 = (0.1f == 0.1);
        boolean b3 = (1.0 == 1.0);
        boolean b4 = (1.0f == 1.0);
        System.out.println("0.1 == 0.1");
        System.out.println(b1);
        System.out.println("0.1f == 0.1");
        System.out.println(b2);
        System.out.println("1.0 == 1.0");
        System.out.println(b3);
        System.out.println("1.0f == 1.0");
        System.out.println(b4);
        
        System.out.println("0.1f is actually " + new BigDecimal(0.1f));
        System.out.println("0.1 is actually " + new BigDecimal(0.1));
        System.out.println("1.0f is actually " + new BigDecimal(1.0f));
        System.out.println("1.0 is actually " + new BigDecimal(1.0));
        System.out.println("1.3f is actually " + new BigDecimal(1.3f));
        System.out.println("1.3 is actually " + new BigDecimal(1.3));
    }
}