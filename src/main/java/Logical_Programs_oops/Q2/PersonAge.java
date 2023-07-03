package Logical_Programs_oops.Q2;

import java.util.Scanner;

public class PersonAge {
    private void age(int age) {

        if(age>=13 && age<=19){
            System.out.println("Teen");
        }else if(age<13){
            System.out.println("Kid");
        }else{
            System.out.println("Adult");
        }


    }

    public static void main(String[] args) {
        PersonAge personAge=new PersonAge();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Persons Age  ");
        int getAge=scanner.nextInt();
        personAge.age(getAge);
    }


}
