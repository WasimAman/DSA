package wasim;
import java.util.Arrays;
import java.util.Scanner;

public class LinearElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {65,28,55,7,87,34,20,45,11,2,6,9,44,23};
        System.out.print("Enter target element:- ");
        int target = sc.nextInt();
        int element = linearElement(arr, target);
        System.out.println(Arrays.toString(arr));
        if(element==Integer.MAX_VALUE){
            System.out.println("Sorry element is not persent in array");
        }else{
            System.out.println(element+" is persent in array");
        }
        sc.close();
    }

    public static int linearElement(int[] arr  , int tagret){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }else{
            for(int element:arr){
                if(element==tagret){
                    return element;
                }
            }
        }
        return Integer.MAX_VALUE;
        /*
            why am i returning -> Integer>MAX_VALUE 
            reaseon:-
                    in previouse program i returned index no as -1 it because 
                    -1 (negative) can never be an index but in this program i'm 
                    gonna return value as Integer.MAX_VALUE insted of returning
                    as -1 beacuse int value can be -1 it can't be Integer.MAX_VALUE(int max range)
        */
    }
}
