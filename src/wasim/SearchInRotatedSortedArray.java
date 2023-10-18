package wasim;
import java.util.Scanner;

public class SearchInRotatedSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {7,8,9,1,2,3,4,5,6};
        System.out.print("Enter target element:- ");
        int key = sc.nextInt();
        System.out.println(binary(arr,key));
    }
    public static int binary(int[] arr,int key){
        int start = 0,end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key) {
                return mid;
            }else if(arr[start]<arr[mid]){
                // Left part of array is sorted
                if(key>=arr[start] && key<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                // if upper else-if condition is false means right part of array is sorted
                if(key>arr[mid] && key<=arr[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
