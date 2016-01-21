import java.util.Arrays;
public class SelectionSort{
    public static void main(String[] args){
        int[] bigO = new int[] {7, 6, 5, 4, 3, 2, 1};
        int[] bigOmega = new int[] {1, 2, 3, 4, 5, 6, 7};
        System.out.println("BIG O");
        selectionSort(bigO);
        System.out.println("BIG OMEGA");
        selectionSort(bigOmega);
    }
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(i + 1 + " time through OUTER loop is " + Arrays.toString(arr));
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                System.out.println("\t" + (j - i) + " time through INNER loop is " + Arrays.toString(arr));
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}