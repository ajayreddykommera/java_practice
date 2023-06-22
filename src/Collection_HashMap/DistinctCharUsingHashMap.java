package Collection_HashMap;


import java.util.HashMap;
import java.util.Map;

public class DistinctCharUsingHashMap {

    public static void main(String[] args) {
        String testString = "test string";
        String string = testString.replaceAll("\\s", "");
        HashMap<Character, Integer> distinctCharacters = new HashMap<>();

        for (char character : string.toCharArray()) {
            if (distinctCharacters.containsKey(character)) {
                distinctCharacters.put(character, distinctCharacters.get(character) + 1);
            } else {
                distinctCharacters.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : distinctCharacters.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
