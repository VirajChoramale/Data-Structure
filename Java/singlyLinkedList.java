
public class singlyLinkedList
{
	 Node head;
    public class Node{
        int data;
        Node nxt;
        int a=5;
        Node(int d){
           data=d;
           nxt=null;
        }

    }
    public  void insertAtLast(int data){
        Node newNode= new Node(data);
        if(head==null){
             head= newNode;
             return;
        }
        newNode.nxt=null;
        Node temp=head;
        while(temp.nxt!=null){
            temp=temp.nxt;
        }
        temp.nxt=newNode;
        //return;
      
     
    }
    public void insertAtBeg(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.nxt=head;
        head=newNode;
    }
    public void printList(){
        
        Node tnode = head;
        while (tnode!= null)
        {
            System.out.println(tnode.data);
            tnode = tnode.nxt;
        }
   
    }
    public void insertAfter(int key,int data){ //key= data value not node no
           Node newNode=new Node(data);
           Node temp=head;
           if(head==null){
            System.out.println("Please Create LinkedList first");
            return;
        }
          Node prev=head;   //initially we assign prev=head if key present in first list
            while(temp!=null){
                if(temp.data==key){
               
                    newNode.nxt=temp.nxt;
                    temp.nxt=newNode;
                    return;
                }

                prev=temp;
                temp=temp.nxt;
           
           }
           System.out.println("Ket Not found");

         
           
    }
    public void deleteNode(int key){
          Node temp=head;
          Node prev=head;
          while(temp!=null){
            if(temp.data==key){
                prev.nxt=temp.nxt;
                temp=null;

                 return;
            }
            prev=temp;
            temp=temp.nxt;
          }
          System.out.println("invalid key");

    }
     
   public static void main(String[] args) {
        
    singlyLinkedList ll=new singlyLinkedList() ; 
   ll.insertAtLast(10);
   ll.insertAtLast(20);

   // ll.printList();
    ll.insertAtBeg(250);
   // ll.printList();
    ll.insertAfter(20,30);
      //enter data value which after you want to insert newList
   // ll.printList();
    ll.deleteNode(10);
    ll.printList();



   //System.out.println(m);

}
}
