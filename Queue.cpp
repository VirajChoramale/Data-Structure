#include<bits/stdc++.h>
using namespace std;
class Queue
{
     public:
     stack <int> s1;
     stack <int> s2;

    void enqueue(int x){
        while(!s1.empty()){
            s2.push(s1.top());
            s1.pop();
        }
        s1.push(x);
        while(!s2.empty()){
            s1.push(s2.top());
            s2.pop();
        }
    }
    void dequeue()
    {
          if(s1.empty())
          {
              cout<<"queue is empty"<<endl;
            
          }
          int x=s1.top();
           s1.pop();
           cout<<x;
     }

    


};





int main(){
    Queue q;
    q.enqueue(1);
 q.enqueue(2);
 q.enqueue(3);
 q.enqueue(4);
 q.dequeue();

}
