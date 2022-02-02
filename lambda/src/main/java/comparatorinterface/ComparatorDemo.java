package comparatorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        //Ascending sort
        Collections.sort(list);
        System.out.println(list);

        //Descending Order
        Collections.sort(list, new MyComparator());

        Collections.sort(list, ((o1, o2) -> (o1 > o2)? -1 : (o1 < o2) ? 1:0));

        //Ascending
        list.sort( (o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending Order
        list.sort( (o2, o1) -> o1.compareTo(o2) );
        System.out.println(list);
    }
}