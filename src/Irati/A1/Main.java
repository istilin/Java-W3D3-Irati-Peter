package Irati.A1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap <String, String> test = new HashMap<>();
        test.put("Example1", "Hello");
        test.put("Example2", "World");
        test.put("Example3", "!");

        System.out.println(test);
        System.out.println(test.get("Example1"));
        System.out.println(test.containsKey("Example1"));
        System.out.println(test.containsValue("Hello"));
        System.out.println(test.get("Example1").equals("Hello"));
        System.out.println(test.size());
        for(String key : test.keySet()){
            System.out.println(key + ": " + test.get(key));
        }
        test.remove("Example3");
        System.out.println(test);
        test.replace("Example1", "Byebye");
        System.out.println(test);
        test.clear();
        System.out.println(test);
    }
}
