package wasim;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();
        boolean prime = false;
        int c = 2;
        while(c<=(Math.sqrt(num))){
            if(num%c==0){
                prime = true;
                break;
            }else{
                c++;
            }
        }
        if(prime){
            System.out.println(num+" is a Compossite number");
        }
        else{
            System.out.println(num+" is a prime number");
        }
        System.out.println(c);
        sc.close();
    }
}
