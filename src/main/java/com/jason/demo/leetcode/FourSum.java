package com.jason.demo.leetcode;

import java.util.*;

/**
 * 18.四数之和
 *
 * @author: liangzx
 * @create: 2019-02-12 13:05
 **/
public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        int length = nums.length;
        if(length <= 3) {
            return new ArrayList<List<Integer>>();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < length - 3; i ++){
            if (i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            for(int j = i + 1; j < length - 2; j ++){
                if (j>i+1 && nums[j]==nums[j-1]) {
                    continue;
                }
                int indexL = j + 1;
                int indexR = length - 1;
                while(indexL < indexR){
                    int sum = nums[i] + nums[j] + nums[indexL] + nums[indexR];
                    int diff = target - sum;
                    if(diff == 0){
                        result.add(Arrays.asList(nums[i], nums[j], nums[indexL], nums[indexR]));
                        while(indexL < indexR && nums[indexL] == nums[indexL + 1]) {
                            indexL ++;
                        }
                        while(indexR > indexL && nums[indexR] == nums[indexR - 1]) {
                            indexR --;
                        }
                        indexR --;
                        indexL ++;
                    } else if(diff < 0){
                        indexR --;
                    } else {
                        indexL ++;
                    }
                }
            }
        }
        return result;
    }
}
