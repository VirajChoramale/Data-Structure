public class doublyLL {
    Node head;
    public class Node{
     
      int data;
      Node prev;
      Node nxt;
      
    
      Node(int dat){
          data=dat;
           prev=null;
          nxt=null;
      }
  }
    void insertAtBeg(int data){
          Node newNode=new Node(data);

          if(head==null){
            head=newNode;
            return;

          }
       
          newNode.nxt=head;
        if(head!=null){ head.prev=newNode;
        }
         head=newNode;

          
    }


      public void insertAfter(int data){
          Node newNode=new Node(data);
         
         
          if(head==null){
              head=newNode;
              return ;
          }
          newNode.nxt=null;
          Node temp=head;
         while(temp.nxt!=null){  
    
           temp=temp.nxt;
         } 
         temp.nxt=newNode;
         newNode.prev=temp;

        
         temp.nxt=newNode;
        
  
  
          
      }
      public void printList(){
        Node temp=head;
        Node prev=head;
        while(temp!=null){
            
              prev=temp;
            temp=temp.nxt;
        }
        Node last=prev;
        while(last!=null){
            System.out.println(last.data);
            last=last.prev;
        }
    
   
    }
    public static void main(String[] args)  {
      doublyLL dl=new doublyLL();
      dl.insertAfter(10);
      dl.insertAfter(10);
      dl.insertAfter(40);
      dl.insertAtBeg(450);
     dl.printList();
    }
}
