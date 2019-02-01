package com.jason.demo.leetcode;

import java.util.Arrays;

/**
 * @program: vscode
 * @description:
 * @author: liangzx
 * @create: 2019-01-21 11:28
 **/
public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        if(length < 3){
            return 0;
        }
        Arrays.sort(nums);
        int closestNum = 0;
        int delta = Integer.MAX_VALUE;
        for(int i = 0; i < length - 2; i ++){
            int j = i + 1;
            int k = length - 1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                int tempDiff = sum - target;
                if(tempDiff > 0){
                    k --;
                }else if(tempDiff < 0){
                    j ++;
                }else {
                    return target;
                }
                if(Math.abs(tempDiff) < delta){
                    closestNum = sum;
                    delta = Math.abs(tempDiff);
                }
            }
        }
        return closestNum;
    }
}
