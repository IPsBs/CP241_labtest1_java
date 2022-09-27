public class LinkedStack implements StackADT{
    MyNode top;
    public LinkedStack(){
        top = null;
    }
    @Override
    public void push(Object item) throws Exception {
        if(full()){
            throw new Exception();
        }else{
            top = new MyNode(item,top);
        }
    }

    @Override
    public Object pop() throws Exception {
        if(full()){
            throw new Exception();
        }else{
            Object temp = top.getData();
            top = top.getNextNode();
            return temp;
        }
    }

    @Override
    public Object top() throws Exception {
        return top.getData();
    }

    @Override
    public boolean empty() {
        return top ==null;
    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public void clear() {
        top = null;
    }

}