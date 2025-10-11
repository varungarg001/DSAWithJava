package Collection.MapInterface;

import java.util.*;

public class HashMapClass {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();

        // in hashmap order of insertion may be different but in to insert in element in the way we entered then we use LinkedHashMop

        myMap.put(1, "varun kumar");
        myMap.put(2, "nishchal");
        // myMap.put(1, "dushyant");
        myMap.putIfAbsent(1, "hello");
        myMap.put(4, "sandeep");

        System.out.println(myMap);

        System.out.println(myMap.get(1));  // get(key)

        // if the value key is not present then it returns null

        // System.out.println(myMap.get(10));

        // to resolve we can getordefault() if the key is found it will return the value of that if it doesnot find it,so it will return default value provided by you.

        System.out.println(myMap.getOrDefault(11, "not present"));

        System.out.println(myMap.containsKey(1)); // if will return boolean value that provide result that the value is present in the hash or not.

        System.out.println(myMap.containsValue("varun"));

        // for traversing

        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        for (Integer entry : myMap.keySet()) {
            System.out.println(entry);
        }
        

        for(String entry:myMap.values()){
            System.out.println(entry);
        }
    }
}
