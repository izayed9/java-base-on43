import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayStrList {
    public static void main(String[] args) {
        // multiple item added at a time
        ArrayList<String> frutes = new ArrayList<String>(Arrays.asList("mango", "banana", "Orange", "pinapple"));

        System.out.println(frutes);
        ArrayList<Integer> list = new ArrayList<Integer>();
        // multiple item added in array
        list.addAll(Arrays.asList(1,6,3,2,5,4));
        
        // add a element
        list.set(0, 10);
        // get element 
        int ind0 = list.get(0);
        System.out.println(ind0);


        System.out.println(list);
        Collections.sort(list);

        System.out.println(list);
        
    }
}
