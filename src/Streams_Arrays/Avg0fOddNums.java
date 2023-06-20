package Streams_Arrays;

import java.util.Arrays;

public class Avg0fOddNums {
    public static void main(String[] args) {


        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        double average = Arrays.stream(numbers).filter(num -> num % 2 != 0).mapToInt(num -> num * num).average().orElse(0);
        System.out.println("Average of squares of odd numbers is  " + average);

    }
}