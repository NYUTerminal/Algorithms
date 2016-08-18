package leetcode;
import java.util.Stack;

public class QueueFromStack232 {
	// Push element x to the back of queue.
    Stack<Integer> stack1= new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(!stack2.empty()){
            stack2.pop();
        }else{
            if(stack1.empty()){
                return;
            }
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
            if(!stack2.empty()){
                stack2.pop();
            }
        }
    }

    // Get the front element.
    public int peek() {
        if(!stack2.empty()){
            return (Integer)stack2.peek();
        }else{
            if(stack1.empty()){
                return 0;
            }
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
            return (Integer)stack2.peek();
        }
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}
