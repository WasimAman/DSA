package wasim;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows,cols;
        System.out.print("How many rows do you want:- ");
        rows = sc.nextInt();
        System.out.print("How many cols do you want:- ");
        cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter Element's for array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // This is one method to print the array element's...
        System.out.println("Array Element's are:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // This is the second method to print array element's...
        for(int[] i:arr){
            System.out.println(Arrays.toString(i));
        }

        // Third way to print the array element's...
         for(int i=0;i<rows;i++){
            System.out.println(Arrays.toString(arr[i])); 

        }
        // System.out.print(Arrays.toString(arr)); // this syntax is applicable only for 1-D array
        sc.close();
    }
}
