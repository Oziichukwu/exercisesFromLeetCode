package arrays;

public class EqualityArray {

    public static void main(String[] args) {

        int[] number1 = {1, 2, 3, 4, 5, 6};
        int[] number2 = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < number1.length; i++) {
            if (number1.length == number2.length && number1[i] == number2[i]) {
                System.out.println("the two are equal");
            } else {
                System.out.println("not equal");
            }
        }
    }
}
