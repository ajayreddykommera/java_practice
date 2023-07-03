package Optionals_DateApi;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1996, 12, 13);
        LocalDate now = LocalDate.now();

        Period period = Period.between(birthdate, now);
        int age = period.getYears();

        System.out.println("The age is: " + age);
    }
}
