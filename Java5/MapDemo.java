import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("scott", "tiger");
        map.put("jack", "jili");
        map.put("polo", "lili");

        // Same key "jack" -> old value is replaced
        map.put("jack", "rose");

        System.out.println("Scott: " + map.get("scott"));
        System.out.println("Polo: " + map.get("polo"));
        System.out.println("Jack: " + map.get("jack"));

        System.out.println("-- Traversing using keySet()");

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}