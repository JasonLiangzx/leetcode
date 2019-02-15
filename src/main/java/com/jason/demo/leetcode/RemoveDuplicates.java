package com.jason.demo.leetcode;

/**
 * 26. 删除排序数组中的重复项
 *
 * @author: liangzx
 * @create: 2019-02-15 10:45
 **/
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if(nums == null) return 0;
        int length = nums.length;
        if(length == 0) return 0;
        int size = 1;
        int num = nums[0];
        for(int i = 1; i < length; i ++){
            if(nums[i] != num){
                size ++;
                num = nums[i];
                nums[size - 1] = num;
            }
        }
        return size;
    }
}
