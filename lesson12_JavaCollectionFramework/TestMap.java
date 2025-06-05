import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("ASmith",30);
        hashMap.put("CJohn",40);
        hashMap.put("DBob",29);
        hashMap.put("BJane",29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap+"\n");

        Map<String , Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in TreeMap");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("John",40);
        linkedHashMap.put("Bob",29);
        linkedHashMap.put("Jane",29);
        System.out.println("\nThe age for"+" Bob is "+linkedHashMap.get("Bob"));
        System.out.println(linkedHashMap);
    }
}
