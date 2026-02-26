/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int pow=0;
        int decNum=0;
/*
        while(head>0){
            int ld=head%10;
            decNum=decNum +(int)ld*Math.pow(2,pow);
            pow++;
            head=head/10;
        }*/

        while (head != null) {
            decNum = decNum * 2 + head.val;
            head = head.next;
        }

        return decNum;
    }
}