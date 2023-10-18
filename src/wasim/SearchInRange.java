package wasim;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,554,65,3,98,56,23,90,110,11,43,56};
        int start,end,target;
        System.out.print("Enter your range:- ");
        start = sc.nextInt();
        end = sc.nextInt();
        System.out.print("Enter your target element:- ");
        target = sc.nextInt();
        int index = search(arr, start, end, target);
        if(index==-1){
            System.out.println("Target element is not found!!!");
        }else{
            System.out.println("Target element found at index "+index);
        }
        sc.close();
        
    }

    public static int search(int[] arr,int start,int end,int target){
        for(int i=start;i<end;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
