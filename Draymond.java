public class Draymond{
    public static void main(String[] args){
        boolean klayThompson = true;
        boolean stephCurry = true;
        String champions = "Golden State Warriors";
        String losers = "Cleveland Cavaliers";
        System.out.println("Klay Thompson?");
        if(klayThompson)
          System.out.println("Yup.");
        else
          System.out.println("Nope.");
        System.out.println("Splash Brothers?");
        if (klayThompson && stephCurry){
            System.out.println("Yup.");
        } else{
            System.out.println("Nope.");
        }
        System.out.println("We won?");
        if (losers == "Cleveland Cavaliers" || champions == "Golden State Warriors"){
            System.out.println("Yup.");
        }
        else {
            System.out.println("Nope.");
        }
        System.out.println("They suck?");
        System.out.println("Yup.");
        System.out.println("We here?");
        System.out.println("Yup.");
        System.out.println("They not?");
        System.out.println("Nope.");
    }
}