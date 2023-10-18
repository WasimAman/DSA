// Here i am gonna sort array element's...
package wasim;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {7,8,5,3,1,6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }   
    }
}
