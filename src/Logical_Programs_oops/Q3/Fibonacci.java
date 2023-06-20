package Logical_Programs_oops.Q3;

import java.util.Scanner;

public class Fibonacci {
    private void generateFibonacci(int n) {
        int firstValue=0;
        int secondValue=1;
        for (int i=1;i <= n;i++) {
            System.out.print(firstValue + ", ");
            int nextValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = nextValue;
        }
    }


    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N Value ");
        int n=scanner.nextInt();

        fibonacci.generateFibonacci(n);

    }




}
