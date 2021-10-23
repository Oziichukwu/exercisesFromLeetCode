package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MedianOfSortedArrayTest {

    @Test
    public void medianOfSortedArrayTest(){

        int [] nums1 = {1,2};
        int [] nums2 = {3,4};

        assertEquals(2.5, MedianOfSortedArray.findMedianOfArray(nums1, nums2));
    }
}
