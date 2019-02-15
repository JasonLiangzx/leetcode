package com.jason.demo.leetcode;

/**
 * 21. 合并两个有序链表
 *
 * @author: liangzx
 * @create: 2019-02-12 16:40
 **/
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        } else if(l2 == null){
            return l1;
        }
        ListNode head = null;
        if(l1.val <= l2.val){
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        }else{
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }

}
