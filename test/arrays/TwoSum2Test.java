package arrays;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSum2Test {

    @Test

    public void twoSum2Test(){

        int [] numbers = {2,7,11,15};
        int target = 18;

        assertArrayEquals(new int[]{1,2}, TwoSum2.twoSum2(numbers, target));
    }

    public static int [] threeSum(int [] number, int target){
        Map<Integer,Integer>myMap = new HashMap<>();
        for (int i = 0; i < number.length; i++) {
            int targetTracker = target - number[i];
            if (myMap.containsKey(targetTracker)){
                return new int[]{myMap.get(targetTracker), i};
            }else {
                myMap.put(number[i], i);
            }
        }
        return new int[]{};
    }
}

