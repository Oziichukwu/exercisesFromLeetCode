package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveElementTest {

    @Test
    void removeElement() {

        int[] numbers = {1, 1, 1, 2, 2, 2};
        int numberOfValues = 2;
        int actual = RemoveElement.removeElement(numbers, numberOfValues);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
