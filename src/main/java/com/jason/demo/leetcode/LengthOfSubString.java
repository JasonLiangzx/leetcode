package com.jason.demo.leetcode;

public class LengthOfSubString {

    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        int index0 = 0;
        int[] chars = new int[1024];
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            int index = array[i] - 0;
            int lastIndex = chars[index];
            if (lastIndex != 0) {
                if (index0 == 0) {
                    length = i;
                }
                index0 = lastIndex > index0 ? lastIndex : index0;
                int l0 = i - index0 + 1;
                length = l0 > length ? l0 : length;
            }
            chars[index] = i + 1;
            int cal = i - index0 + 1;
            length = cal > length ? cal : length;
        }
        int tmp = array.length - index0;
        return length > tmp ? length : tmp;
    }
}
