package wasim;
import java.util.Scanner;
public class OccrenceOfNumber {
    public static void main(String[] wasim){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();
        System.out.println("Enter number Which occrence you want to search:- ");
        int occ = sc.nextInt();
        int count = 0;
        sc.close();
        while(num>0){
            int rem = num%10;
            num = num/10;
            if(rem==occ){
                count++;
            }
        }
        System.out.println("The occrence of "+occ+" is "+count);
    }
}
