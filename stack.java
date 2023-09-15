class stack1{
    public int arr[];
    public int top;
    public int size;
    stack1(int x){
        top=-1;
        arr=new int[x];
        size=x;

    }
    public void push(int x){
        if(isfull()==true){
            System.out.println("overflow");
        }
        else{
            top=top+1;
            arr[top]=x;
        }
    }
    public int pop(){
        if(isempty()==true){
            System.out.println("stack is empty");
        }
    return arr[top--];
    }

    public boolean isfull(){
        if(top>=size){
             return true;
        }
        return false;

    }
    public boolean isempty(){
        if(top<0){
             return true;
        }

            return false;

    }
    public void print(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public int peek(){
        if(isempty()==true){
            System.out.println("stack is empty");
        }
      return arr[top];

        
    }
   
}
class  stack{
    public static void main(String args[]){
        stack1 s=new stack1(5);
        s.push(5);
        s.push(8);
        s.push(6);
        s.push(9);
        s.push(10);
        s.pop();
        s.pop();
        s.print();
        System.out.println("the peek element is \n "+s.peek());
        

    }

}