/*
    This algorithm is not good for searching in 2D array because 
    it takes more no of passes.
*/
package wasim;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = {
        //     {1,2,3,4,5,6,7,8,9,10},
        //     {5,6,7,8,78,98,99,110,114,123,234},
        //     {9,10,11,12,34,56,67,78,89,112},
        //     {12,13,14,15,16,17,18,19,20,21,22,23},
        // };
        int[][] arr = {
            {10,20,30,40},
            {11,25,35,45},
            {28,29,37,45},
            {33,34,38,50},
        };
        System.out.print(("Enter target element:- "));
        int target = sc.nextInt();
        int[] ans = binarySearch2D(arr, target);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
    /* 
        we can write sorting code as well then searching step will be like this
        step 1:- call the sorting method
        step 2:- call the search method
    */
    public static int[] binarySearch2D(int[][] arr,int target){
        int count =0;
        for(int i=0;i<arr.length;i++){
            int start = 0,end = arr[i].length-1;
            if(isAssending(arr)){
                while(start<=end){
                    int middle = (start+end)/2;
                    if(arr[i][middle] == target){
                        System.out.println(count);
                        return new int[]{i,middle};
                    }else if(arr[i][middle]>target){
                        end = middle-1;
                    }else{
                        start = middle+1;
                    }
                    count++;

                }
            }else{
                while(start<=end){
                    int middle = (start+end)/2;
                    if(arr[i][middle]==target){
                        System.out.println(count);
                        return new int[]{i,middle};
                    }else if(arr[i][middle]>target){
                        start = middle+1;
                    }else{
                        end = middle-1;
                    }
                }
                count++;
            }
        }
        return new int[]{-1,-1};
    }
    public static boolean isAssending(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length-1;j++){
                if(arr[i][j]>arr[i][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
