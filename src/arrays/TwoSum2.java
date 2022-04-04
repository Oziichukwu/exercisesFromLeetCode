package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

    public static int[] twoSum2(int[] numbers, int target) {
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int key = target - numbers[i];
            if (numberMap.containsKey(key)){
                return new int[]{numberMap.get(key), i};
            } else {
                numberMap.put(numbers[i], i);
            }
        }
        return new int[]{};
    }
}
