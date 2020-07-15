package Irati.A3;
import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        HashMap <String, HashMap<String, String>> dictionary = new HashMap<>();
        HashMap<String,String> word1 = new HashMap<>();
        word1.put("Meaning", "Duck");
        word1.put("Description", "A waterbird with a broad blunt bill, short legs, webbed feet, and a waddling gait.");
        HashMap<String,String> word2 = new HashMap<>();
        word2.put("Meaning", "Pig");
        word2.put("Description", "an omnivorous domesticated hoofed mammal with sparse bristly hair and a flat snout for rooting in the soil, kept for its meat.");
        HashMap<String,String> word3 = new HashMap<>();
        word3.put("Meaning", "Dog");
        word3.put("Description", "a domesticated carnivorous mammal that typically has a long snout, an acute sense of smell, non-retractable claws, and a barking, howling, or whining voice.");
        HashMap<String,String> word4 = new HashMap<>();
        word4.put("Meaning", "Cow");
        word4.put("Description", "a fully grown female animal of a domesticated breed of ox, kept to produce milk or beef.");
        HashMap<String,String> word5 = new HashMap<>();
        word5.put("Meaning", "Cat");
        word5.put("Description", "a small domesticated carnivorous mammal with soft fur, a short snout, and retractable claws. It is widely kept as a pet or for catching mice, and many breeds have been developed.");

        dictionary.put("Ahatea", word1);
        dictionary.put("Txerria", word2);
        dictionary.put("Txakurra", word3);
        dictionary.put("Beheia", word4);
        dictionary.put("Katua", word5);

        System.out.println(dictionary);

        System.out.println(dictionary.containsKey("Txerria"));
        dictionary.remove("Ahatea");

        System.out.println(dictionary);

        for (String name: dictionary.keySet()){
            System.out.println("Name of the animal: " + name + ". Meaning: " + dictionary.get(name).get("Meaning") + ".  Description: " + dictionary.get(name).get("Description"));

        }

    }
}
