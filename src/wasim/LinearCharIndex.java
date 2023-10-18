package wasim;
import java.util.Arrays;
import java.util.Scanner;

public class LinearCharIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "qwertyuioplkjhgfdsa";
        System.out.print("Enter target element:- ");
        char tagret = sc.next().trim().charAt(0);
        int index = linearIndex(str, tagret);
        System.out.println(Arrays.toString(str.toCharArray()));
        if(index==-1){
            System.out.println("Charecter not found!");
        }else{
            System.out.println(tagret+" found at index "+index);
        }
        sc.close();
    }

    public static int linearIndex(String str,char target){
        if(str.length()==0){
            return -1;
        }else{
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==target){
                    return i;
                }
            }
        }
        return -1;
    }
}
