package Collection.ListInterface;

// import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListClass {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(); // doubly ll
        // operations

        // insertions of an element
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(10);
        list.add(1);
        list.add(18);
        // System.out.println(list);

        // deletions in list
        list.remove(1); // it deletes the vzlue present at index 1
        list.remove(Integer.valueOf(1)); // it deletes where 1 is present at first

        // System.out.println(list);

        // .contains(int e) it tells whether the element is present or not in the array.

        // System.out.println(list.contains(7));

        // .set is use to set the value at particular index and value at that index is replace with the new value.
        list.set(0, 20);
        System.out.println(list);

        // traversing

        Iterator<Integer> itr = list.iterator();
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        ListIterator<Integer> itr1 = list.listIterator();

        while (itr1.hasNext()) {
            System.out.print(itr1.next() + " ");

            if (itr1.hasPrevious()) {
                System.out.print(itr1.previous());
                break;
            }
        }
        System.out.println();

        // Sorting using comparator ??
        list.sort(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a - b;
            }
            // negative A->B
            // postive B->A
        });
        System.out.println(list);
    }
}
