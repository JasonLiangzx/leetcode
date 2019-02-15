package com.jason.demo.leetcode;

/**
 * 24. 两两交换链表中的节点
 *
 * @author: liangzx
 * @create: 2019-02-15 09:17
 **/
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode node1 = head;
        if(node1 == null){
            return null;
        }
        ListNode node2 = head.next;
        if(node2 == null){
            return node1;
        }
        ListNode temp = node2.next;
        node2.next = node1;
        node1.next = swapPairs(temp);
        return node2;
    }
}
