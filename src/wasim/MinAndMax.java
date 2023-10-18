package wasim;
import java.util.Arrays;
import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {65,28,55,7,87,34,20,45,11,2,6,9,44,23};
        int minVal = getMin(arr);
        int maxVal = getMax(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Min value is "+minVal);        
        System.out.println("Max value is "+maxVal);
        sc.close();
    }

    public static int getMin(int[] arr){
        int min=arr[0];
        if(arr.length==0){
            System.out.println("Array is empty!");
        }else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min = arr[i];
                }
            }
        }
        return min;
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        if(arr.length==0){
            System.out.println("Array is empty!");
        }else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
        }
        return max;
    }
}
