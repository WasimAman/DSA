// In this program i am gonna sort arraylist element's...
package wasim;
import java.util.ArrayList;
import java.util.Scanner;
public class InsertionSortArrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>mylist = new ArrayList<>();
        System.out.print("How many Element do you want to insert:- ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" Element:- ");
            mylist.add(sc.nextInt());
        }

        
        for(int i=1;i<n;i++){
            int current = mylist.get(i);
            int j = i-1;
            while(j>=0 && current<mylist.get(j)){
                mylist.set(j+1,mylist.get(j));
                j--;
            }
            
            mylist.set(j+1,current);
        }
        System.out.print("Arraylist Element's after sorting:- ");
        for(int i=0;i<n;i++){
            System.out.print(mylist.get(i)+"\t");
        }
        sc.close();
    }
}
