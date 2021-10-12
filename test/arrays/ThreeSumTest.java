package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ThreeSumTest {

    @Test
    public void returnIndicesOfThreeNumbersSuchThatTheyAddUpToATargetTest(){

        int [] numbers = {2,7,3,11,15};
        int target = 12;
        assertArrayEquals(new int[]{numbers[0],numbers[1],numbers[2]}, ThreeSum.findThreeSum(numbers,target));
    }
}
