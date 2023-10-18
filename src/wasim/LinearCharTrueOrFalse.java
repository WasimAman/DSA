package wasim;
import java.util.Arrays;
import java.util.Scanner;

public class LinearCharTrueOrFalse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "qwertyuioplkjhgfdsa";
        System.out.print("Enter target element:- ");
        char tagret = sc.next().trim().charAt(0);
        boolean b = linearTrueOrfalse(str, tagret);
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(b);
        sc.close();
    }

    public static boolean linearTrueOrfalse(String str,char target){
        if(str.length()==0){
            return false;
        }else{
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==target){
                    return true;
                }
            }
        }
        return false;
    }
}

