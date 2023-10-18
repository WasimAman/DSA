package wasim;
import java.util.Arrays;
import java.util.Scanner;

public class LInearTrueOrFalse {
    public static void main(String[] args) {
        int[] arr = {65,28,55,7,87,34,20,45,11,2,6,9,44,23};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target element:- ");
        int target = sc.nextInt();
        boolean b = linearTrueOrFalse(arr,target);
        System.out.println(Arrays.toString(arr));
        
        System.out.println(b);
        sc.close();
    }

    public static boolean linearTrueOrFalse(int[] arr,int target){
        if(arr.length==0){
            return false;
        }else{
            for(int i=0;i<arr.length;i++){
                if(arr[i] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
