package Collection.MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        Map<Integer, String> linkedMap = new LinkedHashMap<>();

        linkedMap.put(1, "varun");
        linkedMap.put(2, "varun kumar");
        linkedMap.put(7, "nishchal");

        linkedMap.putIfAbsent(3, "dushyant");

        System.out.println(linkedMap.getOrDefault(10, "not present"));
        System.out.println(linkedMap.getOrDefault(7, "not present"));

        System.out.println(linkedMap);
    }
}
