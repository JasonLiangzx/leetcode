package com.jason.demo.leetcode;

/**
 * 27. 移除元素
 *
 * @author: liangzx
 * @create: 2019-02-15 10:57
 **/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int length = nums.length;
        for(int j = 0; j < length; j ++){
            if(nums[j] == val){
                i ++;
                continue;
            }
            if(i != 0){
                nums[j - i] = nums[j];
            }
        }
        return length - i;
    }
}
