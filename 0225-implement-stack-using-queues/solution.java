class MyStack {
    private List<Integer> stack;
    private int top;
    public MyStack() {
        stack = new ArrayList<>();
        top = -1;
    }
    
    public void push(int x) {
        stack.add(x);
        top++;
    }
    
    public int pop() {
        if(top < 0) return -1;
        int val = stack.get(top);
        stack.remove(top);
        top--;
        return val;
    }
    
    public int top() {
        int val = stack.get(top);
        return val;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
