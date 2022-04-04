package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegersTest {

    @Test
    void testThatIntegersCanBeReversedTest() {

        int integers = -123;
        assertEquals(-321, ReverseIntegers.performReverseInteger(integers));
        System.out.println(ReverseIntegers.performReverseInteger(integers));
    }
}
