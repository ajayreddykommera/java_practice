package Strings_Logical_Assements;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Rotation rotation=new Rotation();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter 2st String:");
        String string2 = scanner.nextLine();
        if(rotation.checkRotation(string1,string2)){
            System.out.println("rotation of another string");
        }else{
            System.out.println("not rotation of another string");
        }
    }

    private Boolean checkRotation(String string1, String string2) {
        if(string1.length()!=string2.length())
            return false;
        else {
            string1+=string1;
            return string1.contains(string2);
        }
    }

}
