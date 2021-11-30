package arrays;

public class RemoveElement {
    public static int removeElement(int[] numbers, int numberOfValues) {

        int len = numbers.length;
        for (int i = 0; i <len ; i++) {
            while (numbers[i] == numberOfValues && i < len){
                numbers[i] = numbers[--len];
            }
        }
        return len;
    }
}
