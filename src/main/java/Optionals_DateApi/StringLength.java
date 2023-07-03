package Optionals_DateApi;
import java.util.Optional;

public class StringLength {

    public static Optional<String> getLength(String input) {
        if (input == null) {
            return Optional.empty();
        } else {
            return Optional.of(String.valueOf(input.length()));
        }
    }

    public static void main(String[] args) {
        String str = "AjayReddy";
        Optional<String> length = getLength(str);
        System.out.println(length.get());

        String nullStr = null;
        length = getLength(nullStr);
        System.out.println(length.orElse(" "));
    }
}
