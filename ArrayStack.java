public class ArrayStack implements StackADT{
    private int total;
    private Object s[];
    int top;
    public ArrayStack(){
        total = 50;
        s = new Object[total];
        top = -1;
    }

    @Override
    public void push(Object e) throws Exception {
        if(full()){
            throw new Exception("Stack is full");
        }
        top++;
        s[top] = e;
    }

    @Override
    public Object pop() throws Exception {
        if(empty()){
            throw new Exception("Stack is empty");
        }
        Object temp = s[top];
        top--;
        return temp;
    }

    @Override
    public Object top() throws Exception {
        if(empty()){
            throw new Exception("Stack is empty");
        }
        return s[top];
    }

    @Override
    public boolean empty() {
        return top == -1;
    }

    @Override
    public boolean full() {
        return top == total - 1;
    }

    @Override
    public void clear() {
        top = -1;
    }
    
}
