public class circularLinkedList {
    node tail;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            next=null;
        }
    }
    
    void insertAtbegining(int x){
        node newnode=new node(x);
        if(tail==null){
           tail=newnode;
           tail.next=newnode;
        }
        else{
            newnode.next=tail.next;
            tail.next=newnode;
        }
    }
    void insertAtEnd(int x){
        node newnode=new node(x);
        if(tail==null){
           tail=newnode;
          tail.next=newnode;
        } 
        else{
            newnode.next=tail.next;
            tail.next=newnode;
            tail=newnode;
           
        }

     } 
     void insertAtSpecificPosition(int x,int pos){
        node newnode=new node(x);
        if(tail==null){
           tail=newnode;
          tail.next=newnode;
        } 
        else{
        node temp=tail.next;
        int i=1;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

     }
     void deleteAtBeginning(){
        if(tail==null){
            System.out.println("node is empty");
        }
        else{
        node temp=tail.next;
        node pretemp=temp;
        temp=temp.next;
        tail.next=temp;
        pretemp=null;
     }
    }
    void print(){
         node temp=tail.next;
         while(temp.next!=tail.next){
            System.out.println(temp.data);
            temp=temp.next;
         }
         System.out.println(tail.data);
    }
    public static void main(String[] args) {
        circularLinkedList cl=new circularLinkedList();
        cl.insertAtbegining(4);
        cl.insertAtbegining(3);
        cl.insertAtbegining(2);
        cl.insertAtbegining(1);
        cl.insertAtEnd(5);
        cl.insertAtEnd(6);
        cl.insertAtSpecificPosition(123, 3);
        cl.insertAtSpecificPosition(456, 2);
        cl.deleteAtBeginning();
        cl.deleteAtBeginning();
        cl.deleteAtBeginning();
        cl.deleteAtBeginning();
        cl.deleteAtBeginning();
        cl.deleteAtBeginning();
         cl.print();
    }





}
