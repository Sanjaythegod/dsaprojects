//implement queue data

import java.util.ArrayList;

public class Queue<Q> {
	//Queue = F-i-f-o (first in first out)
	
	//Stack is L-i-f-o, (last in first out)
	
private ArrayList<Q> data;
	
	//add a constructor
	
	public Queue() {
		data = new ArrayList<Q>();
	}
	
	//getter called pop
	//return null if empty
	public Q pop() {
		//REturn the bottom of the queue
		//remove the element
		if(data.size()<=0) return null;
		return data.remove(data.size()-1);
	}
	// preview whats at the bottom of the stack
	
	//return null if empty
	public Q peek() {
		// domt remove it
		if(data.size() <= 0 ) return null;
		return data.get(data.size()-1);
	}
	
	public int size() {
		return data.size();
	}
	
	//create a setter called push
	public void push(Q element) {
		data.add(element);
	}

}
