package _02_string_calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String text) {
        if (isBlank(text)) return 0;
        return getSum(toInts(getTokens(text)));
    }

    private String[] getTokens(String text) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (matcher.find()) {
            String separator = matcher.group(1);
            return matcher.group(2).split(separator);
        }
        return text.split("[,:]");
    }

    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    private int[] toInts(String[] tokenizer) {
        int[] numbers = new int[tokenizer.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = toPositive(tokenizer[i]);
        }
        return numbers;
    }

    private static int toPositive(String tokenizer) {
         int number = Integer.parseInt(tokenizer);
         if (number < 0) {
             throw new RuntimeException();
         }
         return number;
    }


    private int getSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

}
