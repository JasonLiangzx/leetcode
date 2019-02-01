package com.jason.demo.leetcode;

public class IntegerReverse {

    public static int reverse(int x) {
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x = -x;
        }
        String num = String.valueOf(x);
        String max = String.valueOf(Integer.MAX_VALUE);
        int maxLength = max.length();
        int count = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = num.length() - 1; i >= 0; i--) {
            builder.append(num.charAt(i));
            count++;
            if (count == maxLength) {
                String result = builder.toString();
                for (int j = 0; j < count; j++) {
                    int delta = result.charAt(j) - max.charAt(j);
                    if (delta > 0) {
                        return 0;
                    }
                    if (delta < 0) {
                        return negative ? -1 * Integer.valueOf(result) : Integer.valueOf(result);
                    }
                }
                return negative ? -1 * Integer.valueOf(result) : Integer.valueOf(result);
            }
        }
        return negative ? -1 * Integer.valueOf(builder.toString()) : Integer.valueOf(builder.toString());
    }
}
