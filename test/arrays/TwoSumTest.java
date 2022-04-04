package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    @Test
    public void returnIndicesOfTwoNumbersSuchThatTheyAddUpToATargetTest() {

        int[] numbers = {2, 7, 11, 15};
        int target = 22;

        assertArrayEquals(new int[]{1, 3}, TwoSum.findTwoSum(numbers, target));
    }
}
