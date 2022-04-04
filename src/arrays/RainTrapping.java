package arrays;

public class RainTrapping {

    public static int trap(int[] height){

        int left = 0;
        int right = height.length - 1;

        int leftBarrier = 0;
        int rightBarrier = 0;
        int result = 0;

        while (left <= right){
            if (leftBarrier <= rightBarrier){

                if(height[left] > leftBarrier){
                    leftBarrier = height[left];
                }else {
                    result += leftBarrier - height[left];
                }
                left++;
            }else{
                if (height[right] > rightBarrier){
                    rightBarrier = height[right];
                }else{
                    result += rightBarrier - height[right];
                }
                right--;
            }
        }

        return result;
    }
}
