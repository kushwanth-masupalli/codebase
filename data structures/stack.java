public class stack{
    int [] arr = new int[100];
    int top =-1;
    public void push(int n){
       if(top==arr.length-1){
        System.out.println("the stack is full");
       }
       else{
        top++;
        arr[top]=n;
       }

    }

    public void pop(){
        if(top==-1){
            System.out.println("the stack is empty not possible to pop");
        }
        else{
            System.out.println("the popped element is"+arr[top]);
            top--;
        }
    }

    public void display(){
        if(top==-1){
            System.out.println("the stack is empty nothing to dispaly");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String []args){
        stack o = new stack();
        o.push(2);
        o.push(24);
        o.push(27);
        o.push(23);
        o.push(32);
        o.push(29);
        o.pop();
        o.pop();
        o.display();
    }
}