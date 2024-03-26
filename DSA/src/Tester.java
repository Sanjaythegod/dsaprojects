import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tester {

	@Test
	void test() {
		Stack<Integer> myStack = new Stack<Integer>();
		
		//an empty stack should return a size of 0;
		
		assert(myStack.size() == 0); //nothing added
		assert(myStack.pop()==null); //
		assert(myStack.peek() == null);
		
		// push twice
		myStack.push(2);
		myStack.push(11);
		//see if its true
		
		assert(myStack.size()==2);
		assert(myStack.peek() == 11);
		
		assert(myStack.pop()==11);
		
		//check that the size changed and thw new top is 2
		
		assert(myStack.peek()==2);
		assert(myStack.size()==1);
		
	}

}
