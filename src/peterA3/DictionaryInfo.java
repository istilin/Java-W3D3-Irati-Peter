package peterA3;

import java.util.HashMap;

@SuppressWarnings("ALL")
public class DictionaryInfo {
  static String name;
  static String meaning;
  static String example;

  public DictionaryInfo(String name, String meaning, String example) {
    DictionaryInfo.name = name;
    DictionaryInfo.meaning = meaning;
    DictionaryInfo.example = example;
  }

  public static void createDictionary() {

    HashMap<String, String> dictionary = new HashMap<>();


    {
      new DictionaryInfo("Rest in Power: \n", "MEANING: \nPhrase meaning that a deceased cannot rest in \n" +
          "peace until society changes due to the circumstances of a death.\n",
          "EXAMPLE: \nPeople said rest in power for the unarmed man had been shot by the police.");

      dictionary.put(DictionaryInfo.name, DictionaryInfo.meaning + DictionaryInfo.example);
    }

    {
      new DictionaryInfo("Double Texting: \n", "MEANING: \nSending two texts in a row without a reply " +
          "inbetween.\n", "EXAMPLE: \nRachel" +
          ": whats up?\n" +
          "Tessa: not to much! hbu?\n" +
          "Tessa: dude, i'm so bored.\n" +
          "Rachel: stop double texting me.\n");

      dictionary.put(DictionaryInfo.name, DictionaryInfo.meaning + DictionaryInfo.example);
    }

    {
      new DictionaryInfo("maskadaisicial", "MEANING: \nSlacking off on wearing a mask in public \n" +
          "places to prevent contracting coronavirus.\n", "EXAMPLE: \nDude, we have to go back to the house. I forgot my mask and I " +
          "can't get into Costco without it.\n" +
          "\n" +
          "Man, you are becoming maskadaisical!\n");

      dictionary.put(DictionaryInfo.name, DictionaryInfo.meaning + DictionaryInfo.example);
    }


      System.out.println(dictionary);
    }
  }
