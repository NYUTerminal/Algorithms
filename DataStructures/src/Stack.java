class LinkNode {
	int data;
	String symbol;
	LinkNode link;
}

public class Stack {

	private LinkNode top = null;

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(1);
		s.push(5);
		s.push(3);
		s.push(4);
		s.push(8);
		s.push(6);
		s.printStack();
		s.pop();
		s.printStack();

	}

	private void push(int data) {
		LinkNode newNode = new LinkNode();
		newNode.data = data;
		newNode.link = top;
		top = newNode;
	}

	private int pop() {
		if (top != null) {
			int tempData = top.data;
			top = top.link;
			return tempData;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	private void printStack() {
		LinkNode temp = top;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.link;
		}
	}

	private void pushString(String sym) {
		LinkNode newNode = new LinkNode();
		newNode.symbol = sym;
		newNode.link = top;
		top = newNode;
	}

	private String popString() {
		if (top != null) {
			String tempData = top.symbol;
			top = top.link;
			return tempData;
		} else {
			System.out.println("Stack is empty");
			return null;
		}
	}
}
