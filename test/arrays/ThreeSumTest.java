package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThreeSumTest {

    @Test
    public void returnIndicesOfThreeNumbersSuchThatTheyAddUpToATargetTest() {

        int[] numbers = {2, 3, 7, 11, 15};
        int target = 12;
        assertArrayEquals(new int[]{0, 1, 2}, ThreeSum.findThreeSum(numbers, target));
    }

}
