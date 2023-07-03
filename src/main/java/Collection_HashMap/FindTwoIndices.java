package Collection_HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class FindTwoIndices {

    public static int[] findTwoNumbers(int[] array, int targetSum) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (hashmap.containsKey(targetSum - array[i])) {
                return new int[]{i, hashmap.get(targetSum - array[i])};
            } else {
                hashmap.put(array[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        int targetSum = 100;
        int[] indices = findTwoNumbers(array, targetSum);
        System.out.println(Arrays.toString(indices));
    }
}
