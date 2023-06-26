package Collection_Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetItrs {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String str = "string";
        for (int i = 1; i < 11; i++) {
            set.add(str + i);
        }
        for (int i = 1; i < 5; i++) {
            set.add(str + i);
        }
        set.forEach(System.out::println);

        set.stream().forEach(System.out::println);

        Iterator<String> itr = set.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
