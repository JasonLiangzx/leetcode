package com.jason.demo.leetcode;

public class ConvertZ {

    public static String convert(String s, int numRows) {
        if (numRows == 0 || numRows == 1) {
            return s;
        }
        int length = s.length();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            int left = 2 * (numRows - i - 1);
            int right = 2 * i;
            int index = i;
            if (i >= length) {
                break;
            }
            builder.append(s.charAt(i));
            for (int j = 0; index < length; j++) {
                if (left != 0) {
                    index = index + left;
                    if (index < length) {
                        builder.append(s.charAt(index));
                    }
                }
                if (right != 0) {
                    index = index + right;
                    if (index < length) {
                        builder.append(s.charAt(index));
                    }
                }
            }
        }
        return builder.toString();
    }
}
