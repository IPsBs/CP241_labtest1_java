interface StackADT {
    public void push(Object item)throws Exception; 
    public Object pop()throws Exception;
    public Object top()throws Exception;
    public boolean empty();
    public boolean full();
    public void clear();
    
}