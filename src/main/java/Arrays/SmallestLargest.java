package Arrays;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        SmallestLargest smallestLargest=new SmallestLargest();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        System.out.println("Enter the elements in Array");
        Scanner scanner1=new Scanner(System.in);
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]= scanner1.nextInt();
        }
        int smallestNum = array[0];
        int largestNum = array[0];

        for(int i=1; i< array.length; i++)
        {
            if(array[i] > largestNum)
                largestNum = array[i];
            else if (array[i] < smallestNum)
                smallestNum = array[i];

        }
        System.out.println("Smallest Number is : " + smallestNum);
        System.out.println("Largest Number is : " + largestNum);


    }
}
