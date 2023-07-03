package Collection_Hashset;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        String string = "ajayreddykommera";
        for (char c : string.toCharArray()) {
            set.add(c);
        }
        set.forEach(System.out::print);
    }
}
