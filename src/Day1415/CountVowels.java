package Day1415;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountVowels {
    public static void main(String[] args) {
        String[] strings = {"denton", "prosper", "irving", "frisco", "aubrey", "Fry"};

        Arrays.stream(strings)
                .filter(str -> countVowels(str) > 0)
                .forEach(str -> System.out.println("String: " + str + ", Vowel Count: " + countVowels(str)));
    }

    public static int countVowels(String str) {
        String vowels = "aeiou";
        return (int) str
                .toLowerCase()
                .chars()
                .filter(c -> vowels.indexOf(c) != -1)
                .count();
    }
}

