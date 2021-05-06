package assignment6;

public class FixedStack implements IntStack{
	
	private int stack[];
	private int top;
	
	public FixedStack(int len) {
		stack = new int[len];
		top = -1;
	}
	
	@Override
	public void push(int data) {
		// TODO Auto-generated method stub
		if(top == stack.length - 1) {
			System.out.println("   Stack Overflow");
		}else {
			stack[++top] = data;
			System.out.println("   Data Added!");
		}
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(top < 0) {
			System.out.println("   Stack Underflow");
			return 0;
		}else {
			return stack[top--];
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top < 0) {
			return true;
		}else {
			return false;
		}
	}

}
