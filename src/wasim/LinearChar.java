package wasim;
import java.util.Arrays;
import java.util.Scanner;
public class LinearChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "qwertyuioplkjhgfdsa";
        System.out.print("Enter target element:- ");
        char tagret = sc.next().trim().charAt(0);
        char element = linearChar(str, tagret);
        System.out.println(Arrays.toString(str.toCharArray()));
        if(element==' '){
            System.out.println("Charecter not found!");
        }else{
            System.out.println(element+" is persent in \" "+str+ " \"");
        }
        sc.close();
    }

    public static char linearChar(String str,char target){
        if(str.length()==0){
            return ' ';
        }else{
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==target){
                    return str.charAt(i);
                }
            }
        }
        return ' ';
    }
}
