package arrays;

import java.util.Arrays;

public class TwoSum {

    public static int[] findTwoSum(int[] numbers, int target) {

        Arrays.sort(numbers);

        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {

            if (numbers[first] + numbers[last] == target) {

                return new int[]{first, last};
            } else if (numbers[first] + numbers[last] < target) {
                first++;
            } else {
                last--;
            }
        }

        return new int[]{};
    }
}
