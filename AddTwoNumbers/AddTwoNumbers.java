/*************************************************
*  
*  -- Solution For Add Two Numbers On Leetcode --
*
*  Runtime: 7ms
*  Memory Usage: 44.78 MB
*
*  Description: This solution uses long addition to
*               add the two linked lists together.
*
**************************************************/          

//TODO: This solution is very unoptimized and messy, clean it up

public class AddTwoNumbers extends ListNode {
    
    class Solution {
         
         public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
           
             String firstNum = extractedNums (l1); 
             String secondNum = extractedNums (l2);
             ListNode l3 = new ListNode ();
             
             int digit = 0;
             boolean remainder = false;
             boolean init = true;
                            
                while (firstNum.length() != 0 && secondNum.length() != 0) {
                
                  int firstDigit = Integer.parseInt(firstNum.substring(firstNum.length() - 1, firstNum.length()));
                  int secondDigit = Integer.parseInt(secondNum.substring(secondNum.length() - 1, secondNum.length()));
                  
                  firstNum = firstNum.substring (0, firstNum.length() - 1);
                  secondNum = secondNum.substring (0, secondNum.length() - 1);
                  
                     if (remainder != false) {
                        firstDigit++;
                        remainder = false;
                     } 
                     
                  digit = firstDigit + secondDigit;
                  
                     if (digit >= 10) {
                        digit = digit - 10;
                        remainder = true;
                     }
                  
                  if (init == true) {
                     l3 = Solution.addToLinkedList(l3, digit, true);
                     init = false;
                  } 
                     else 
                        l3 = Solution.addToLinkedList(l3, digit, false);   
                }
               
            if (firstNum.length() != 0) {
               
               while (firstNum.length() != 0) {
                
                  int firstDigit = Integer.parseInt(firstNum.substring(firstNum.length() - 1, firstNum.length()));
                  firstNum = firstNum.substring (0, firstNum.length() - 1);                 
                
                     if (remainder != false) {
                        firstDigit++;
                        remainder = false;
                     } 
                     
                  digit = firstDigit;
                  
                     if (digit >= 10) {
                        digit = digit - 10;
                        remainder = true;
                     }
                  
                  l3 = Solution.addToLinkedList(l3, digit, false);   
                
                }
                
            }
            
            if (secondNum.length() != 0) {
              
               while (secondNum.length() != 0) {
                
                  int secondDigit = Integer.parseInt(secondNum.substring(secondNum.length() - 1, secondNum.length()));
                  secondNum = secondNum.substring (0, secondNum.length() - 1);                  
                
                     if (remainder != false) {
                        secondDigit++;
                        remainder = false;
                     } 
                     
                  digit = secondDigit;
                  
                     if (digit >= 10) {
                        digit = digit - 10;
                        remainder = true;
                     }
                 
                  l3 = Solution.addToLinkedList(l3, digit, false);   
                
                }
     
            }    
            
            if (remainder == true)
               l3 = Solution.addToLinkedList(l3, 1, false);
           
            return l3; 
         }
                      
         public static ListNode addToLinkedList (ListNode l1, int val, boolean isInit) { 
            
            if (isInit == true) { 
              l1.val = val;
              return l1;
            }
            
            if (l1.next == null) { 
               l1.next = new ListNode (val);
               return l1;
            }
            
            addToLinkedList (l1.next, val, false);
            return l1;
  
         }
       
         public static String extractedNums (ListNode lst) {
         
           if (lst.next == null) { 
               return Long.toString(lst.val);
           }
   
           String temp = extractedNums(lst.next);
           return temp + Long.toString(lst.val); 
   
         } 
           

    }

    
    public static void main (String[] args) {
    
        ListNode l1 = new ListNode (9);
        ListNode l2 = new ListNode (8);
        
        ListNode l3 = Solution.addTwoNumbers(l1,l2);
        System.out.println (Solution.extractedNums (l3));    
                
    }
    
    
}
    