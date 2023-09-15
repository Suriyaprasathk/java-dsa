public class linkedlist{
    node head;
    node tail;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;

            next=null;
        }
    }

    void insertAtBeginning(int x){
        node newnode=new node(x);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }

    void insertAtEnd(int x){
        node newnode=new node(x);
          if(head==null){
             head=newnode;
            tail=newnode;
          
        }else{
         newnode=new node(x);
        tail.next=newnode;
        tail=newnode;
        }
    }
     void insertAtSpecificPosition(int x,int pos){
        node newnode=new node(x);
          if(head==null){
             head=newnode;
            tail=newnode;
          
        }else{
         node temp=head;
         int i=1;
         while(i<pos-1){
            temp=temp.next;
            i++;
        }
        node newnode=new node(x);
        newnode.next=temp.next;
        temp.next=newnode;
       }
    }

        int size(){
            node temp=head;
            int count=0;
            while(temp.next!=null){
                count++;
                temp=temp.next;
            }
            count++;
            return count;
        }
    void deleteAtBeginning(){
          if(head==null){
            System.out.println("node is empty");
          
        }else{
        node temp=head;
        head=head.next;
        temp=null;
    }
}
    void deleteAtEnd(){
         if(head==null){
            System.out.println("node is empty");
          
        }else{
        node temp=head;
        node pretemp=temp;
        while(temp.next!=null){
            pretemp=temp;
            temp=temp.next;
        }
        pretemp.next=null;
    }
   }
    void deleteAtSpecificPosition(int pos){
         if(head==null){
            System.out.println("node is empty");
          
        }else{
        node temp=head;
        int i=1;
        node pretemp=temp;
        while(i<pos){
            pretemp=temp;
            temp=temp.next;
            i++;
        }
        pretemp.next=temp.next;
        temp=null;

    }}
    void print(){
         if(head==null){
            System.out.println("node is empty");
          
        }else{
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }}
    // void sort(){
    //     for(int i=0;i<size()-1;i++){
    //         for(int j=i+1;j<size();j++){
    //         }
    //     }
    // }

    public static void main(String[] args) {
        linkedlist l=new linkedlist();
       
        l.insertAtBeginning(3);
        l.insertAtBeginning(2);
        l.insertAtBeginning(1);
        l.insertAtEnd(4);
        l.insertAtEnd(5);
        l.print();
        System.out.println();
       // l.deleteAtBeginning();
       l.deleteAtSpecificPosition(2);

        l.print();
        System.out.println();
        System.out.println(l.size());
    }
}
