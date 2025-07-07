 public class ListNode {
      
      int val;
      ListNode next;
      
      ListNode() {} // basic constructor

      ListNode(int val) { // constructor that does not include pointer to next value
        this.val = val; 
      }

      ListNode(int val, ListNode next) { // constructor with a pointer and a value
        this.val = val; this.next = next; 
      }
 }