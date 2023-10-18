package wasim;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,3,4,6,2,1};
        bubbleSort1(arr);  
        System.out.println(Arrays.toString(arr));
        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));
    } 

    // First way.
    public static void bubbleSort1(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Second way.
    public static void bubbleSort2(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    // Swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}