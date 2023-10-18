package wasim;
public class EvenNoDigit {
    public static void main(String[] args) {
        int[] arr = {67,4789,75,9,3,654,23,6543,-5332};
        int count = 0;
        for(int num : arr){
            if(isEven(num)){
                count++;
            }
        }
        System.out.println(count);
        // System.out.println(noOfDigit2(0));        
        // System.out.println(noOfDigit(-23454563));

    }
    // Check whether num contains even no of digit or not.
    public static boolean isEven(int num){
        int digit = noOfDigit2(num);
        return digit%2==0;
    }
    // Check how many digit does num contain.
    public static int noOfDigit(int num){
        int count=0;
        if(num== 0){
            return 1;
        }else{
            while(num!=0){
                num /= 10;
                count++;
            }
        }
        return count;
    }
    // Another way to check how many digit does num contain.
    public static int noOfDigit2(int num){
        if(num<0){
            num*=-1;
        }else if(num==0){
            return 1;
        }
        return (int)(Math.log10(num)+1);
    }
}
