package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThreeSumUsingMapTest {

    @Test
    public void performThreeSumUsingHashTable() {
        int[] numbers = {2, 3, 5, 7, 11, 15};
        int target = 14;
        assertArrayEquals(new int[]{0, 2, 3}, ThreeSumUsingMap.performThreeSumUsingMap(numbers, target));
    }
}
