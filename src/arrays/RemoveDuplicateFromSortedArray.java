package arrays;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {


    public static int performRemovalOfDuplicateElement(int[] numbers) {
        int j = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0 || numbers[i] != numbers[i - 1]) {
                numbers[++j] = numbers[i];
            }
        }
        return j + 1;
    }

}
