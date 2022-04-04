package arrays;

public class Palindrone {

    public static boolean performPalindrone(int numbers) {

        Integer num = numbers;

        String word = num.toString();

        for (int i = 0, j = word.length() - 1; i < j; i++, j--) {

            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
