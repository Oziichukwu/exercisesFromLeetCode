package arrays;

import java.util.Arrays;

public class MedianOfSortedArray {


    public static double findMedianOfArray(int[] nums1, int[] nums2) {

        int[] number = new int[nums1.length];
        int[] number1 = new int[nums2.length];
        System.arraycopy(nums1, 0, number, 0, nums1.length);

        System.arraycopy(nums2, 0, number1, 0, nums2.length);

        System.arraycopy(number1, 0, number, 0, number.length);


        return 0.0;
    }
}
