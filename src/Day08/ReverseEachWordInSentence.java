package Day08;

import java.util.Scanner;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    private static String reverseWords(String sentence) {
        String words[] = sentence.split("\\s+");
        String reversedSentence="";


        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord += word.charAt(j);
            }
            reversedSentence +=reverseWord + " ";
        }
        return reversedSentence;


    }

}
