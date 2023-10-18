/*
    This algorithm is best for searching in 2D array because it takes less no of passes.
*/
package wasim;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch2DSecondMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
            {10,20,30,40},
            {11,25,35,45},
            {28,29,37,45},
            {33,34,38,50},
        };
        System.out.print("Enter target element:- ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(binarySearch(arr, target)));
        sc.close();
    }

    public static int[] binarySearch(int[][] arr, int target){
        int row = 0,col = arr[row].length-1,count=0;
        while(row<=col){
            if(arr[row][col]==target){
                System.out.println(count);
                return new int[]{row,col};
            }else if(arr[row][col]>target){
                col--;
            }else{
                row++;
            }
            count++;
        }
        return new int[]{-1,-1};
    }
}
