import java.util.ArrayList;

public class Stack<T> {
	
	//implement storing data using a 1d array
	
	private ArrayList<T> data;
	
	//add a constructor
	
	public Stack() {
		data = new ArrayList<T>();
	}
	
	//getter called pop
	//return null if empty
	public T pop() {
		//REturn the Top of the stack
		//remove the element
		if(data.size()<=0) return null;
		return data.remove(data.size()-1);
	}
	// preview whats at the top of the stack
	
	//return null if empty
	public T peek() {
		// domt remove it
		if(data.size() <= 0 ) return null;
		return data.get(0);
	}
	
	public int size() {
		return data.size();
	}
	
	//create a setter called push
	public void push(T element) {
		data.add(element);
	}
	
}
