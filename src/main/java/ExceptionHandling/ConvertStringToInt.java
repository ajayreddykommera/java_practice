package ExceptionHandling;

public class ConvertStringToInt {
    public static int convertStringToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
            return -1;  // Or any other appropriate value to indicate failure
        }
    }
    public static void main(String[] args) {
        String[] inputs = {"23", "45.67", "test", "123f"};

        for (String input : inputs) {
            System.out.print("Input: " + input + " -> ");

            int result = convertStringToInt(input);

            if (result != -1) {
                System.out.println("Output: " + result);
            }
        }
    }
}
