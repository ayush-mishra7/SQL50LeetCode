/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    int size(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        int sizeA=size(headA);
        int sizeB=size(headB);
        int diff=sizeA-sizeB;

        while(diff>0){
            headA=headA.next;
            diff--;
        }
        while(diff<0){
            headB=headB.next;
            diff++;
        }

        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }

        return null;
    }
}