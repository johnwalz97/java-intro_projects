public class Needle{
    public static void main(String[] args){
        String haystack = "//////////////////////////////needle////////";
        int startingIndex = haystack.indexOf("needle");
        int endingIndex = startingIndex + "needle".length();
        System.out.println(endingIndex);
        System.out.println(haystack.substring(startingIndex, endingIndex));
    }
}