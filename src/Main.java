import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("111", "111");
//        map.put("222", "111");
//        map.put("333", "111");
//        map.put("444", "111");
//        map.put("555", "111");
//        map.put("666", "111");
//        map.put("777", "111");
//        map.put("888", "111");
//        map.put("999", "111");
//        map.put("aaa", "111"); // 10
//        map.put("bbb", "111"); // 11
//        map.put("ccc", "111"); // 12
//
//        map.put("ddd", "111"); // 13
//        map.put("eee", "111"); // 14
//        map.put("fff", "111"); // 15
//
//         String val1 = map.get("222");
//
//         String val2 = map.get("ccc");
//
//        System.out.println("222:" + (49650 & 15));
//        System.out.println("ccc:" + (98306 & 15));
//
//        System.out.println("222:" + (49650 & 31));
//        System.out.println("ccc:" + (98306 & 31));

//        System.out.println("BinaryString 222:" + Integer.toBinaryString(49650));
//        System.out.println("BinaryString ccc:" + Integer.toBinaryString(98306));
//        System.out.println("BinaryString 16:" + Integer.toBinaryString(16));

//        Map<String, String> map = new HashMap<>(16);
//        map.put("111", "111");
        Map<String, String> map = new LinkedHashMap<>();
        map.put("111", "111");
        map.put("222", "222");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> mapEntry = iterator.next();
            mapEntry.getKey();
        }

    }
}
