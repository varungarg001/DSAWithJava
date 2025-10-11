package Collection.MapInterface;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        
        // searching - O(log n )

        treeMap.put(1, "varun");
        treeMap.put(2, "varun kumar");
        treeMap.put(7, "nishchal");

        treeMap.putIfAbsent(3, "dushyant");

        System.out.println(treeMap.getOrDefault(10, "not present"));
        System.out.println(treeMap.getOrDefault(7, "not present"));

        System.out.println(treeMap);
    }
}
