package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConvertIntegersToRomanNumeralTest {
    @Test
    void convertIntegersToRomanNumeralsTest() {

        int integer = 5439;

        assertEquals("MMMMMCDXXXIX", ConvertIntegersToRomanNumeral.convertToRomanNumeral(integer));
    }

}
