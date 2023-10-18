// wasim
// package wasim;
import java.util.Scanner;
public class AdvCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("1) arithmetic\t\t\t2) reverse & check pelindrom\n3) GCD of two number\t\t4) LCM of two number\n5) sum of digit\t\t\t6) occrence of a digit\n7) prime or composite\t\t8) even or odd\n9) fibonacci sequence\t\t10) factorial\n11) armstrong number\t\t12) exit");      
            System.out.print("\t\tEnter your choice:- ");
            choice = sc.nextInt();
            if(choice==12){
                break;
            }
            else{
                switch (choice) {
                    case 1:
                        arithmetic();
                        break;
                    case 2:
                        reverse();
                        break;
                    case 3:
                        gcd();
                        break;
                    case 4:
                        lcm();
                        break;
                    case 5:
                        sumOfDigit();
                        break;
                    case 6:
                        occrenceOfDigit();
                        break;
                    case 7:
                        primeOrComposite();
                        break;
                    case 8:
                        evenOrOdd();
                        break;
                    case 9:
                        fibonacci();
                        break;
                    case 10:
                        factorial();
                        break;
                    case 11:
                        armstrong();
                        break;
                    default:
                        System.out.println("Invalid choice!!!");
                }
            }
 
        }
        sc.close();
    }
    public static void arithmetic(){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int choice;
        while(true){
            System.out.print("1) Addition\t\t2) Substraction\n3) Division\t\t4) Multiplication\n5) Reminder\t\t6) Exit\n\t\tEnter operation:- ");
            choice = sc.nextInt();
            if(choice==6){
                break;
            }
            else{
                System.out.print("Enter two number's:- ");
                int num1 = sc.nextInt();            
                int num2 = sc.nextInt();
                switch(choice){
                    case 1:
                        ans = num1+num2;
                        System.out.println(ans);
                        break;
                    case 2:
                        ans = num1-num2;
                        System.out.println(ans);
                        break;
                    case 3:
                        ans = num1*num2;
                        System.out.println(ans);
                        break;
                    case 4:
                        if(num2!=0){
                            ans = num1/num2;
                            System.out.println(ans);
                        }
                        else{
                            System.out.print("Denominator can't be zero please enter again:- ");
                            num2 = sc.nextInt();
                        }
                        break;
                    case 5:
                        ans = num1%num2;
                        System.out.println(ans);
                        break;
                    default:
                        System.out.println("Invalid operation!!");
                        break;
                }
            }
        }
        sc.close();
    }
    public static void reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp!=0){
            int rem = temp%10;
            temp = temp/10;
            rev = (rev*10)+rem;
        }
        System.out.println("Before reverse the number is "+num);        
        System.out.println("After reverse the number is "+num);
        sc.close();
    }
    public static void gcd(){
        Scanner sc = new Scanner(System.in);
        int min,res=0;
        System.out.print("Enter first number:- ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:- ");
        int num2 = sc.nextInt();
        if(num1<num2){
            min = num1;
        }
        else{
            min = num2;
        }
        for(int i=1;i<=min;i++){
            if(num1%i==0 && num2%i==0){
                res = i;
            }
        }
        System.out.println("GCD of "+num1+" and "+num2+" is "+res);
        sc.close();
    }
    public static void lcm(){
        Scanner sc = new Scanner(System.in);
        int max,res=1;
        System.out.print("Enter first number:- ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:- ");
        int num2 = sc.nextInt();
        if(num1>num2){
            max = num1;
        }
        else{
            max = num2;
        }
        for(int i=1;i<=max;i++){
            if(num1%i==0 && num2%i==0){
                res *= i;
            }
        }
        System.out.println("GCD of "+num1+" and "+num2+" is "+res);
        sc.close();
    }
    public static void sumOfDigit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();
        int sum = 0,rem,temp;
        temp = num;
        while(temp!=0){
            rem = temp%10;
            sum+=rem;
            temp = temp/10;
        }
        System.out.println("The sum of digit's of "+num+" is "+sum);
        sc.close();
    }
    public static void occrenceOfDigit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();
        System.out.print("Enter number whose occrence you want to check:- ");
        int occ = sc.nextInt();
        int count = 0;;
        while(num!=0){
            int rem = num%10;
            if(rem==occ){
                count++;
            }
            num = num/10;
        }
        System.out.println("The occrence is "+count);
        sc.close();
    }
    public static void primeOrComposite(){
        Scanner sc = new Scanner(System.in);
        boolean comp = false;
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();
        int i = 2;
        while(i*i<=num){
            if(num%i==0){
                comp = true;
            }
        }
        if(comp){
            System.out.print(num+" is a composite number");
        }
        else{
            System.out.print(num+" is a prime number");
        }
        sc.close();
    }
    public static void evenOrOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.print(num+" is an even number");
        }
        else{
            System.out.print(num+" is a odd number");

        }
        sc.close();
    }
    public static void fibonacci(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Upto how many term fibonacci sequnce you want:- ");
        int term = sc.nextInt(); 
        int first = 0;
        int second = 1;
        if(term<1){
            System.out.print("Please enter possitive number's");
        }
        else if(term==1){
            System.out.print(first);
        }
        else{
            System.out.print(first+"  "+second);
            for(int i=2;i<=term;i++){
                int next = first+second;
                System.out.print("  "+next);
                int temp = second;
                second=next;
                first=temp;
            }
        }
        sc.close();
    }
    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=2;i<=num;i++){
            fact*=i;
        }
        System.out.print("Factorial of "+num+" is "+fact);
        sc.close();
    }
    public static void armstrong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();
        int count = 0,temp = num,arm=0;
        while(temp!=0){
            temp = temp/10;
            count=count+1;
        }
        temp = num;
        while(temp!=0){
            int rem = temp%10;
            arm += (int)Math.pow(arm, rem);
            temp = temp/10;
        }
        if(arm==num){
            System.out.println(num+" is an armstrong number");
        }
        else{
            System.out.println(num+" is not a armstrong number");
        }
        sc.close();
    }

}
