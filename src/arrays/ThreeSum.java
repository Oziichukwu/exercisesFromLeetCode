package arrays;

import java.util.Arrays;

public class ThreeSum {

    public static int[] findThreeSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int firstIndex = 0;
        int secondIndex = firstIndex + 1;
        int lastIndex = numbers.length - 1;

        while (firstIndex < lastIndex) {

            if (numbers[firstIndex] + numbers[secondIndex] + numbers[lastIndex] == target) {
                return new int[]{firstIndex, secondIndex, lastIndex};
            } else if (numbers[firstIndex] + numbers[secondIndex] + numbers[lastIndex] < target) {
                firstIndex++;
            } else {
                lastIndex--;
            }
        }
        return new int[]{};
    }
}
