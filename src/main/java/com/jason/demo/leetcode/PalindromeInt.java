package com.jason.demo.leetcode;

public class PalindromeInt {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int[] array = new int[10];
        int size = 0;
        while (x != 0) {
            int i = x % 10;
            array[size++] = i;
            x = x / 10;
        }
        if (size == 1) {
            return true;
        }
        for (int i = 0; i < size / 2; i++) {
            if (array[i] != array[size - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
