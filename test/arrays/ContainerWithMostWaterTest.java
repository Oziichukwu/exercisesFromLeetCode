package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainerWithMostWaterTest {

    @Test
    void containerWithMostWaterTest() {

        int[] height = {5, 3, 2, 1, 4};
        assertEquals(16, ContainerWithMostWater.performOperation(height));


    }

}
