package wasim;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.print("Enter target element:- ");
        int target = sc.nextInt();
        int index = binary(arr, target);
        if(index==-1){
            System.out.println("Target element is not present in array!!!");
        }else{
            System.out.println("Target element is found at index "+index);
        }
        sc.close();
    }

    public static int binary(int[] arr,int target){
        int start,end,middle;
        start = 0;
        end = arr.length-1;
        if(isAscending(arr)){
            while(start<=end){
                middle = start+end;
                if(arr[middle]==target){
                    return middle;
                }else if(arr[middle]>target){
                    end = middle-1;
                }else{
                    start = middle+1;
                }
            }
        }else{
            while(start<=end){
                middle = start+end;
                if(arr[middle]==target){
                    return middle;
                }else if(arr[middle]>target){
                    start = middle+1;
                }else{
                    end = middle-1;
                }
            }
        }
        return -1;
    }
    public static boolean isAscending(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
