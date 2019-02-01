package com.jason.demo.leetcode;

public class AToI {

    public static int myAtoi(String str) {
        int index = trim(str);
        // 检查字符串是否合法
        boolean hasSign = false;
        boolean negative = false;
        for (; index < str.length(); index++) {
            char c = str.charAt(index);
            if (!hasSign && c == '+') {
                hasSign = true;
                continue;
            }
            if (!hasSign && c == '-') {
                hasSign = true;
                negative = true;
                continue;
            }
            if (hasSign && !isNum(c)) {
                return 0;
            }
            if (isNum(c)) {
                break;
            }
            return 0;
        }
        boolean firstNonZero = false;
        StringBuilder builder = new StringBuilder();
        for (; index < str.length(); index++) {
            char c = str.charAt(index);
            if (isNum(c)) {
                if (!firstNonZero) {
                    if (c != '0') {
                        firstNonZero = true;
                        builder.append(c);
                    }
                } else {
                    builder.append(c);
                }
            } else {
                break;
            }
        }
        String number = builder.toString();
        String max = String.valueOf(Integer.MAX_VALUE);
        int length = number.length();
        int maxLength = max.length();
        if (length == maxLength) {
            for (int i = 0; i < length; i++) {
                char a = number.charAt(i);
                char b = max.charAt(i);
                if (a < b) {
                    return stringToInt(number, negative);
                } else if (a > b) {
                    if (negative) {
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                }
            }
        }
        if (length > maxLength) {
            if (negative) {
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
        return stringToInt(number, negative);
    }

    private static boolean isNum(char c) {
        return c >= '0' && c <= '9';
    }

    private static int stringToInt(String str, boolean negative) {
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            number = number * 10 + str.charAt(i) - '0';
        }
        if (negative) {
            return -1 * number;
        }
        return number;
    }

    private static int trim(String str) {
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                index = i;
                break;
            }
        }
        return index;
    }

}
