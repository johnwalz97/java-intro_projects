public class StarsOne{
    public static void main(String[] args){
        int i;
        for(i = 1; i < 11; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}