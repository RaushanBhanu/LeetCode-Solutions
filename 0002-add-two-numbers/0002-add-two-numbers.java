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
   int carry=0;
    ListNode head=null;
    ListNode tail=null;
  
    
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
      
      if(l1!=null&&l2!=null){
        int n1=l1.val;
          int n2=l2.val;
          int sum=carry+n2+n1;
          
          
          int realv=sum%10;
          carry=sum/10;
          if(head==null&&tail==null){
             ListNode node= new ListNode();
             node.val=realv;
             head=node;
             tail=node;
          }
          else{
               ListNode node= new ListNode();
               node.val=realv;
               tail.next=node;
               tail=node;
          }
          addTwoNumbers2(l1.next,l2.next);
      }
         else  if(l1!=null){
          int n1=l1.val;
          int n2=0;
          int sum=carry+n2+n1;
          
          
          int realv=sum%10;
          carry=sum/10;
          if(head==null&&tail==null){
             ListNode node= new ListNode();
             node.val=realv;
             head=node;
             tail=node;
          }
          else{
               ListNode node= new ListNode();
               node.val=realv;
               tail.next=node;
               tail=node;
          }
          addTwoNumbers2(l1.next,l2);
          
          
      }
    else  if(l2!=null){
          int n1=0;
          int n2=l2.val;
          int sum=carry+n2+n1;
          
          
          int realv=sum%10;
          carry=sum/10;
          if(head==null&&tail==null){
             ListNode node= new ListNode();
             node.val=realv;
             head=node;
             tail=node;
          }
          else{
               ListNode node= new ListNode();
               node.val=realv;
               tail.next=node;
               tail=node;
          }
          addTwoNumbers2(l1,l2.next);
          
          
      }
      return head;
        
        
        
        
    } 
    
    
  
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     
   
        
              addTwoNumbers2(l1,l2);
              if(carry!=0){
                 ListNode node= new ListNode();
                 node.val=carry;
                 tail.next=node;
                
                 
               }
              return head;
             
             
             
           
             
          
         }
}