package com.jason.demo.leetcode;

/**
 * 25. k个一组翻转链表
 *
 * @author: liangzx
 * @create: 2019-02-15 09:47
 **/
public class ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;
        ListNode[] nodeArray = new ListNode[k];

        for(int i = 0; i < k; i ++){
            if(head == null){
                return nodeArray[0];
            }
            nodeArray[i] = head;
            head = head.next;
        }
        reverse(nodeArray, k);
        nodeArray[k-1].next = reverseKGroup(nodeArray[k - 1].next, k);
        return nodeArray[0];
    }

    private void reverse(ListNode[] nodeArray, int k){
        ListNode next = nodeArray[k - 1].next;
        for(int i = 0; i < k / 2; i ++){
            ListNode temp = nodeArray[i];
            nodeArray[i] = nodeArray[k - i - 1];
            nodeArray[k - i - 1] = temp;
        }
        for(int i = 0; i < k - 1; i ++){
            nodeArray[i].next = nodeArray[i + 1];
        }
        nodeArray[k - 1].next = next;
    }
}
