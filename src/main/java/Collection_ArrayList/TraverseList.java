package Collection_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraverseList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("ajay");
        arrayList.add("tej");
        arrayList.add("ravi");
        arrayList.add("vijay");
        arrayList.add("siri");

//using for loop
        System.out.println("using for loop");
        for (int i = 0; i < arrayList.size(); i++) {

            System.out.println(arrayList.get(i));

        }
//enhanced for loop
        System.out.println("using enhanced for loop");
        for (String s : arrayList) {
            System.out.println(s);

        }
//iterator
        System.out.println("using iterator");
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()) System.out.println(iterator.next());


//forEach
        System.out.println("using foreach");
        arrayList.forEach(System.out::println);


//        parallel Stream
        System.out.println("using parallel stream");
        arrayList.stream().parallel().forEach(System.out::println);


    }
}
