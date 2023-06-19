package Day1415;

import java.util.Arrays;
import java.util.stream.Stream;

public class Capitalization {
    public static void main(String[] args) {
        String[] strings = {"denton", "prosper", "irving", "frisco", "aubrey"};


        String[] capitalizedArray = capitalizeArray(strings);

        for (String str : capitalizedArray) {
            System.out.println(str);
        }
    }

    public static String[] capitalizeArray(String[] strings) {
        Arrays.sort(strings);
        Stream<String> capatilzedStream = Arrays.stream(strings).map(str -> str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        return capatilzedStream.toArray(String[]::new);
    }

}