package Optionals_DateApi;
import java.util.Optional;

public class UppercaseString {

    public static Optional<String> toUpperCase(String input) {
        if (input == null) {
            return Optional.empty();
        } else {
            return Optional.of(input.toUpperCase());
        }
    }

    public static void main(String[] args) {
        String str = "ajay reddy";
        Optional<String> length = toUpperCase(str);
        System.out.println(length.get());

        String nullStr = null;
        length = toUpperCase(nullStr);
        System.out.println(length.orElse(" "));
    }
}
