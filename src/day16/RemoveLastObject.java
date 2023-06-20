package day16;

import java.util.ArrayList;
import java.util.List;

public class RemoveLastObject {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("ajay");
        arrayList.add("tej");
        arrayList.add("ravi");
        arrayList.add("vijay");
        arrayList.add("siri");

        int size = arrayList.size();
        System.out.println(arrayList.get(size - 1));
    }
}
