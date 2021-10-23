package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ConvertIntegersToRomanNumeralTest{
    @Test
    void convertIntegersToRomanNumeralsTest(){

        int integer = 300;

        assertEquals("CCC",ConvertIntegersToRomanNumeral.convertToRomanNumeral(integer));
    }

}
