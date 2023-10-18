package wasim;
import java.util.Arrays;
import java.util.Scanner;
public class LinearIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {65,28,55,7,87,34,20,45,11,2,6,9,44,23};
        // System.out.println(Arrays.toString(arr));
        // System.out.println();
        System.out.print("Enter target element:- ");
        int tagret = sc.nextInt();
        
        // calling LinearSc methode...
        int index = linearSc(arr, tagret);
        System.out.println(Arrays.toString(arr)+"\n");
        if(index==-1){
            System.out.println("Target element is not persent in this array!!!");
        }else{
            System.out.println(tagret+" found at index "+index);
        }
        sc.close();

    }
    // Return index no. if target element is persent in the array.
    public static int linearSc(int[] arr,int tagret){
        if(arr.length==0){
            return -1;
        }else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]==tagret){
                    return i;
                }
            }
        }
        return -1;
    }
}
