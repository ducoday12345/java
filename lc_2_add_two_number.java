public class lc_2_add_two_number {
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode temp = new ListNode(0);
            ListNode curr = temp;
            int a = 0;

            while(l1 != null || l2 != null || a == 1 ){
                int sum = 0;
                if(l1 != null){
                    sum += l1.val;
                    l1 = l1.next;
                }

                if(l2 != null){
                    sum += l2.val;
                    l2 = l2.next;
                }
                sum += a;
                a = sum/10;
                ListNode rem = new ListNode(sum%10);

                curr.next = rem;
                curr = curr.next;
            }
            return temp.next;
        }

    }
}
