package ExceptionHandling;

class CustomException extends RuntimeException {

    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            throw new CustomException("An error occurred: " + e.getMessage());
        }
    }
}

