package Streams_Arrays;

import java.util.Arrays;

public class CustomSort {
    public static void main(String[] args) {
        String[] strings = {"abc","abcd","abcdefg","abcde","abca"};

        Arrays.sort(strings, (s1, s2) -> {
            if (s1.length() < s2.length()) {
                return -1;
            } else if (s1.length() > s2.length()) {
                return 1;
            } else {
                return s2.charAt(s2.length() - 1) - s1.charAt(s1.length() - 1);
            }
        });

        // Print the sorted strings
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
