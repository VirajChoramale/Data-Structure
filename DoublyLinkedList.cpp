#include<iostream>
using namespace std;
class Node{
    public:
    int data;
    Node *prev;
    Node *next;
    Node(int dat){
        data=dat;
        prev=0;
        next=0;
    }
};
void creatNode(Node *&head,Node *&last){
        Node *temp=NULL;
        int data;
        cout<<"Enter data"<<endl;
        cin>>data;
        Node *n=new Node(data);
        if(head==NULL){
            head=n;
            return;
        }
        temp=head;
        while(temp->next!=NULL){
            temp=temp->next;

        }
        n->prev=temp;
        temp->next=n;
        last=n;


}
void reversePrint(Node *last){
    Node *temp=last;
    while(temp!=0){
        
        cout<<temp->data;
        temp=temp->prev;
    }
        cout<<"NULL"

}
void print(Node *head){
    Node *temp=NULL;
    temp=head;
    while(temp!=NULL){
        cout<<temp->data<<"->";
        temp=temp->next;
    }
    cout<<"NULL"
}
int main(){
    Node *head=NULL;
    Node *last=NULL;
    creatNode(head,last);
        creatNode(head,last);

    creatNode(head,last);
    print(head);


}