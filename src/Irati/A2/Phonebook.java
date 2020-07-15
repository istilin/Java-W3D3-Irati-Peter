package Irati.A2;

import java.util.HashMap;

public class Phonebook {

    public static void main(String[] args) {
        HashMap <String, Number> phoneBook = new HashMap<>();
        phoneBook.put("Irati", 634500923);
        phoneBook.put("Max", 634523923);
        phoneBook.put("Gloria", 633400923);
        phoneBook.put("Plutonia", 63450054);
        phoneBook.put("Asterix", 615642423);
        phoneBook.put("Obelix", 636782463);

        System.out.println(phoneBook);

        System.out.println(phoneBook.containsKey("Ruben"));
        System.out.println(phoneBook.containsKey("Asterix"));
        phoneBook.remove("Irati");
        System.out.println(phoneBook);

        for(String name: phoneBook.keySet()){
            System.out.println(name + ": " + phoneBook.get(name));

        }
    }
}
