package arrays;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RemoveDuplicateFromSortedArrayTest {

    @Test
    void removeDuplicateFromSortedArrayTest(){

        int[] numbers = { 1, 1, 2, 2, 2, 3, 3 };
        int actual = RemoveDuplicateFromSortedArray.performRemovalOfDuplicateElement(numbers);
        int expected = 3;
        int[] exps = { 1, 2, 3 };
        assertEquals(actual, expected);
        assertArrayEquals(exps, Arrays.copyOfRange(numbers, 0, expected));
    }
}
