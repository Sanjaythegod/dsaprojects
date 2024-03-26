import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesterQ {

	@Test
	void test() {
		Queue<Integer> myQ = new Queue<Integer>();
		
		//an empty stack should return a size of 0;
		
		assert(myQ.size() == 0); //nothing added
		assert(myQ.pop()==null); //
		assert(myQ.peek() == null);
		
		// push twice
		myQ.push(2);
		myQ.push(11);
		//see if its true
		
		assert(myQ.size()==2);
		assert(myQ.peek() == 2);
		
		assert(myQ.pop()==2);
		
		//check that the size changed and thw new top is 2
		
		assert(myQ.peek()==11);
		assert(myQ.size()==1);
	}

}
