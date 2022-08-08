#include<iostream>
using namespace std;

class Stack{
    private:
       int top;
       int x;
       int arr[5];
       public:
       Stack(){
          top=-1;
          for(int i=0;i<5;i++){
              arr[i]=0;
          }
           
       }
       bool isEmpty(){
           if(top==-1)
            return true;
           else
              return false;
       }
       bool isFull(){
           if(top==4)
           return true;
           else 
             return false;
        
       }
       void push(int val){
           if(isFull()){
            cout<<"stack is full"<<endl;
              return;
              }
            else{

            
             top++;
             arr[top]=val;
             
             }
       } 
       int pop(){
            int x;
           if(isEmpty()){
              
               cout<<"Stack is empty"<<endl;
                  return 0;

           }
           else{
               arr[top]=x;
               arr[top]=0;
               top--;
               return x;
           }
       }
       void display(){
           for(int i=top;i>=0;i--){
               cout<<arr[i]<<"->";
           }
       }
       int count(){  //total count in stack
           return top+1;
       }
       void peek(int pos){// to access the any positon
            if(isEmpty()){
                cout<<"Stack is empty"<<endl;
                return;

            }
            else if(pos>top){
                cout<<"No data"<<endl;

            }
            else{
                cout<<arr[pos];
            }
       }
       void change(int pos,int val){
           if(pos>top){
               cout<<"Invalid pos"<<endl;
               return;
           }
           else{
               arr[pos]=val;
           }
       }



};
int main(){
    Stack sc;  //obj created;
   int position,value,choice;
    
   do{     cout<<"\n1.Push"<<endl;
            cout<<"2.pop"<<endl;
            cout<<"3.peek"<<endl;
            cout<<"4.display"<<endl;
            cout<<"5.change"<<endl;
            cout<<"6.count"<<endl;

           cout<<"Enter Your Choice"<<endl;
           cin>>choice;
       switch(choice)

        {   
            case 1:
            cout<<"Enter Value"<<endl;
            cin>>value;
            sc.push(value);
            break;
            case 2:
            
            cout<<sc.pop();
            break;
           
            case 3:
            cout<<"Enter position"<<endl;
            cin>>value;
            sc.peek(value);
            break;
            case 4:
                sc.display();
                   break;
            case 5:
            cout<<"Enter Value"<<endl;
            cin>>value;
            cout<<"Enter Position"<<endl;
            int x;
            cin>>x;
            sc.change(x,value);
               break;
            case 6:
               cout<<sc.count()<<endl;
                  break;
            default:
                cout<<"invalid"<<endl;
                   break;

             




     }

   }while(choice!=0);
   

}