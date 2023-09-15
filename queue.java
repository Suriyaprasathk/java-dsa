class queue1{
    int arr[];
    int front;
    int rear;
    int size;
    queue1(int x){
        arr=new int[x];
        size=x;
        front=-1;
        rear=-1;
    }
    boolean isempty(){
        if(front==-1 && rear==-1){
            return true;
        }
    return false;
    }
    boolean isfull(){
        if(front==0 && rear==size-1){
            return true;
        }
    return false;
    }
    void enqueue(int x){
        if(isfull()==true){
            System.out.println("queue is full");
        }
        else{
            front=0;
            rear++;
            arr[rear]=x;
        }
    }
    void dequeue(){
        if(isempty()==true){
            System.out.println("queue is empty");
        }
        if(front>=rear){
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }
    }
    int peek(){
        return arr[front];
    }
    void print(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }

}

public class queue {
    public static void main(String args[]){
        queue1 q=new queue1(5);
       // q.enqueue(1);
        //q.enqueue(4);
        //q.enqueue(7);
        //q.enqueue(98);
        //q.enqueue(56);
        q.dequeue();
        //q.print();
        //q.dequeue();
        //q.dequeue();
        //q.print();
        System.out.println(q.peek());
        System.out.println(q.isfull());
        System.out.println(q.isempty());
       

    }
    
}
