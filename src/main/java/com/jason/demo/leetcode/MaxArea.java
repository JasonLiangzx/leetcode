package com.jason.demo.leetcode;

public class MaxArea {

    public static int maxArea(int[] height) {
        int max = 0;
        boolean noMatch = false;
        int realHeight = 1;
        int length = height.length;
        while (!noMatch) {
            int left = -1;
            int right = -1;
            boolean hasLeft = false;
            boolean hasRight = false;
            for (int i = 0; i < length; i++) {
                if (!hasLeft && height[i] >= realHeight) {
                    left = i;
                    hasLeft = true;
                }
                if (!hasRight && height[length - i - 1] >= realHeight) {
                    right = length - i - 1;
                    hasRight = true;
                }
                if (hasLeft && hasRight) {
                    if (left == right) {
                        noMatch = true;
                    }
                    break;
                }
            }
            if (left == right) {
                noMatch = true;
            }
            int area = (right - left) * realHeight;
            max = area > max ? area : max;
            realHeight ++;
        }
        return max;
    }

    public static int maxArea2(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;
        while(i < j){
            int area = (j - i) * Math.min(height[i], height[j]);
            max = max > area ? max : area;
            if(height[i] < height[j]){
                i ++;
            }else {
                j --;
            }
        }
        return max;
    }
}
