package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntergersToWords {
    private static final String[] HIGHERWORDS = {"", " Thousand", " Million", " Billion"};
    private static final Map<Integer, String> WORDS = new HashMap<Integer, String>() {{

        put(1, "One");
        put(2, "Two");
        put(3, "Three");
        put(4, "Four");
        put(6, "Six");
        put(7, "Seven");
        put(8, "Eight");
        put(9, "Nine");
        put(10, "Ten");
        put(11, "Eleven");
        put(12, "Twelve");
        put(13, "Thirteen");
        put(14, "Fourteen");
        put(16, "Sixteen");
        put(17, "Seventeen");
        put(18, "Eighteen");
        put(19, "Nineteen");
        put(20, "Twenty");
        put(30, "Thirty");
        put(40, "Forty");
        put(50, "Fifty");
        put(60, "Sixty");
        put(70, "Seventy");
        put(80, "Eighty");
        put(90, "Ninety");
        put(100, "Hundred");


    }};

    @SuppressWarnings({"serial"})
    public static String performConversionToWords(int number) {
        if (number == 0) {
            return "Zero";
        }
        StringBuilder stringBuilder = new StringBuilder();

        int count = 0;

        while (number != 0) {

            int remainder = number % 1000;
            StringBuilder builder = convert(remainder);
            if (builder.length() == 0) {
                count++;
            } else if (stringBuilder.length() == 0) {
                stringBuilder = builder.append(HIGHERWORDS[count++]);
            } else {
                stringBuilder = builder.append(HIGHERWORDS[count++]).append(" ").append(stringBuilder);
            }
            number = number / 1000;
        }

        return stringBuilder.toString();
    }

    private static StringBuilder convert(int number) {

        if (number == 0) {
            return new StringBuilder();
        } else if (number < 20) {
            return new StringBuilder(WORDS.get(number));
        } else if (number % 100 == 0) {
            return new StringBuilder(WORDS.get(number / 100) + " Hundred");
        } else if (number > 100) {
            return new StringBuilder(WORDS.get(number / 100) + " Hundred ").append(convert(number % 100));
        } else if (number % 10 == 0) {
            return new StringBuilder(WORDS.get(number));
        } else if (number > 10) {
            return new StringBuilder(WORDS.get(number / 10 * 10) + " " + WORDS.get(number % 10));
        } else {
            return new StringBuilder();
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to convert to words");
        int integer = input.nextInt();

        String words = performConversionToWords(integer);

        System.out.println(words);

    }
}
