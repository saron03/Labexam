public class ArrayStack {
		int[] array;
		int top;
		int Stacksize;
		
		public ArrayStack(int size) {
			array = new int[size];
			top = -1;
			Stacksize = 0;
		}
		
		public int size() {
			return Stacksize;
		}
		
		void push(int value) {
			if (top < array.length - 1) {
				array[++top] = value;
				Stacksize++;
			}
			else {
				System.out.println("Stack is full can't add more");
				}
		}
		
		public int pop() {
			if (top>=0) {
				int removed = array[top--];
				Stacksize--;
				return removed;
				}
			return -1;
		}
		
		public boolean isEmpty() {
			return Stacksize == 0;
		}
		
		public boolean isFull() {
		return Stacksize == array.length;
		}
		
		public int peek() {
			if(top >= 0) {
				return array[top];
			}
			return -1;
		}
		
		public static void main(String[] args) {
			ArrayStack stack = new ArrayStack(4);
			stack.push(6);
			stack.push(7);
			stack.push(9);
			stack.push(8);
			
			stack.pop();
			
			System.out.print("Elements in the stack: " );
			for (int i = 0; i < stack.Stacksize; i++) {
				System.out.print(  stack.array[i] + "  ");
			}
	    }
}
