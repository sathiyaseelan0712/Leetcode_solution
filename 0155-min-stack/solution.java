class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;
    public MinStack() {
        stack = new Stack<Integer>();
        min = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(min.isEmpty() || val <= min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int popValue = stack.pop();
        if(popValue == min.peek()){
            min.pop();
        }
    }
    
    public int top() {
        if(stack.isEmpty()) return -1;
        return stack.peek();
     }
    
    public int getMin() {
        if(min.isEmpty()) return -1;
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
