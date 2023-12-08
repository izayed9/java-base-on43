
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // add elements integer
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        // get element
        int a = list.get(2);
        System.out.println(a);

        // add element in btween
        list.add(1, 1);

        //  set element
        list.set(1, 5);
        System.out.println(list);

        // delete element
        list.remove(0);
        System.out.println(list);


        // size
        int si = list.size();
        System.out.println(si);

        // loops 
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        // sotrting
       Collections.sort(list);
       System.out.println(list);

        // add string elements
        list2.add("mango");
        list2.add("orange");
        list2.add("black bary");
        list2.add(1, "banana");
        System.out.println(list2);

    }
}
