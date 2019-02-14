package com.jason.demo.leetcode;

/**
 * 23. 合并K个排序链表
 *
 * @author: liangzx
 * @create: 2019-02-14 09:55
 **/
public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        int length = lists.length;
        if(length ==1){
            return lists[0];
        }
        if(length == 0){
            return null;
        }
        ListNode listNode = lists[0];
        for(int i = 1; i < length; i ++){
            listNode = mergeTwoLists(listNode, lists[i]);
        }
        return listNode;
    }

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

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
