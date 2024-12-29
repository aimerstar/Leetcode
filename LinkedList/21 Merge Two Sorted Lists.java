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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 當頭
        ListNode first = new ListNode();
        // 現在指向
        ListNode cur = first;
        while(list1!=null&&list2!=null){
            if(list1.val > list2.val){
                cur.next = list2;
                list2 = list2.next;
            }else{
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }
        // 當其中一個完全為空時
        cur.next = (list1 != null) ? list1 : list2;
        return first.next;
    }
}