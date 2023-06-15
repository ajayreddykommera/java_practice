package Day06.Q1;

import java.util.Scanner;

public class ReverseANumber {

    private int reverseNumber=0;
    private int reverseDigits(int givenNumber) {

        while(givenNumber != 0) {

            // get the last digit from the given number
            int digit = givenNumber % 10; //digit =5

            //add the last digit to reverse number
            reverseNumber = reverseNumber * 10 + digit; // reverseNumber = 0*10+5=5

            // remove the last digit from the given number
            givenNumber /= 10; // given number at this point=1234

        }
        return reverseNumber;
    }
    public static void main(String[] args){

        ReverseANumber rev = new ReverseANumber();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number");
        int number=scanner.nextInt();
        System.out.println(rev.reverseDigits(number));

    }

}
