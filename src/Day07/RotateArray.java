package Day07;

public class RotateArray {

    private int[] getRotatedArray(int[] array, int x) {

        int temp[]=new int[array.length];
        int j=0;
        for(int i=x;i<array.length;i++){
                temp[j]=array[i];
                j++;
        }
        for (int i = 0; i < x; i++) {
            temp[j] = array[i];
            j++;
        }

        return temp;
    }


    public static void main(String[] args) {
        RotateArray rotateArray=new RotateArray();
        int array[]=new int[]{1, 2, 3, 4, 5, 6, 7};
        int x=2;
        int[] rotatedArray=rotateArray.getRotatedArray(array,x);

        for(int i=0;i<rotatedArray.length;i++){
            System.out.print(rotatedArray[i]+",");
        }




    }


}
