package arrays;

import java.util.HashMap;
import java.util.Map;

public class ThreeSumUsingMap {

    public static int[] performThreeSumUsingMap(int[] numbers, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int key = target - (numbers[i] + numbers[i + 1]);
            if (myMap.containsKey(key)) {
                return new int[]{myMap.get(key), i, i + 1};
            } else {
                myMap.put(numbers[i], i);
            }
        }
        return new int[]{};
    }
}
