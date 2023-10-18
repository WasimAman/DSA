package wasim;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add element's
        list.add(23);        
        list.add(45);
        list.add(12);
        list.add(78);
        list.add(99);
        System.out.println(list);

        // Remove element's
        list.remove(4);
        list.remove(3);
        System.out.println(list);

        // Get element's 
        list.get(0);        
        list.get(1);
        list.get(2);
        list.get(3);
        System.out.println(list);
    }
}
