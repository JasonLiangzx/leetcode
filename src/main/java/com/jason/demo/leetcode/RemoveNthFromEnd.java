package com.jason.demo.leetcode;

/**
 * 19. 删除链表的倒数第N个节点
 *
 * @author: liangzx
 * @create: 2019-02-12 15:32
 **/
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 0;
        ListNode dump=new ListNode(0);
        dump.next=head;
        ListNode left =dump;
        ListNode right=dump;
        while(i<n){
            if(right.next==null){
                return null;
            }
            i++;
            right=right.next;
        }

        while (right.next!=null){
            right=right.next;
            left=left.next;
        }
        if(left.next!=null){
            left.next=left.next.next;
        }
        return dump.next;
    }
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}