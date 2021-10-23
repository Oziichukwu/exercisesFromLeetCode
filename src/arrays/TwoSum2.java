package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

    public static int[] twoSum2(int[] numbers, int target) {
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (numberMap.containsKey(complement)) {
                return new int[] { numberMap.get(complement), i };
            } else {
                numberMap.put(numbers[i], i);
            }
        }
        return new int[] {};

    }
}
