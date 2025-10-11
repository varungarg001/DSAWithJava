package Collection.SetInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // set will always holds the unique things
        set.add(1);
        set.add(1);
        set.add(2);
        System.out.println(set);
        
        System.out.println(set.contains(1));
        
        System.out.println(set.remove(1));
        
        set.add(1);
        // keys of map called set

        Iterator<Integer> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
