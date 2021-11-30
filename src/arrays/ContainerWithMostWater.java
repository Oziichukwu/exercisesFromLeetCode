package arrays;

public class ContainerWithMostWater {


    public static int performOperation(int[] height) {

        int left = 0;

        int right = height.length-1;

        int result = 0;

        while (left < right){

          result = Math.max(Math.min(height[left],height[right]) * (right - left), result);

          if (height[left] < height[right]){

              left++;
          }else {
              right--;
          }
        }

        return result;
    }
}
