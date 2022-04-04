package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateSumOfIntegersTest {

    @Test
    void calculateSumOfIntegersInaStringTest() {

        String str = "1trinix2x30maha07";

        assertEquals(40, CalculateSumOfIntegers.performSumOfAllIntegersInaString(str));

    }
}
