package wasim;
import java.util.Arrays;
import java.util.Scanner;

public class LInearSearch2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
            {12,43,64,9},
            {54,87,90,11},
            {23,44},
            {10,-1,-32,-54,-99},
        };
        System.out.print("Enter target element:- ");
        int target = sc.nextInt();
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }
        System.out.println(Arrays.toString(getIndex(arr,target)));
        System.out.println("Max value is "+getMax(arr));        
        System.out.println("Min value is "+getMin(arr));

        sc.close();
    }

    public static int[] getIndex(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static int getMax(int[][] arr){
        int max =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int getMin(int[][] arr){
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

}
