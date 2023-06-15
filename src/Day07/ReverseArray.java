package Day07;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray reverseArray=new ReverseArray();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        System.out.println("Enter the elements in Array");
        Scanner scanner1=new Scanner(System.in);
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]= scanner1.nextInt();
        }
        int arrayReverse[]=new int[size];
        int j=0;
        for(int i=size-1;i>=0;i--){
            arrayReverse[j]= array[i];
            j++;
        }
        for(int i=0;i<size;i++){
            System.out.print(arrayReverse[i]+",");
        }

    }
}
