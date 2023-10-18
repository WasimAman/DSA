package wasim;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args){
        // int[] arr = {5,3,4,6,2,1};        
        int[] arr = {6,5,4,3,2,1};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        // int count = 0;
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            boolean assigned = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                    assigned = true;
                }
            }
            if(assigned){
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }else{
                break;
            }
        }
        // count++;
        // System.out.println(count);
    }
}
