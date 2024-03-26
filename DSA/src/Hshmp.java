import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class Hshmp {
	public static void main(String[] args) {
		HashMap m = new HashMap<String, String>();
		
		
		
		//adding to this map
		m.put("nice", "mean");
		m.put("motivated", "lazy");
		m.put("rich", "poor");
		
		//query for a non existing key
		System.out.println(m.get("study")); // null
		
		//existing key
		System.out.println(m.get("nice"));
		
		//hashmap for ds
		
		HashMap m2 = new HashMap<String, ArrayList<String>>();
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("piZZAZA");
		food.add("cake");
		food.add("burger");
		
		m2.put("Sanjay", food);
		
		System.out.println(m2.get("Sanjay"));
		
		// hashmap for data
		
		HashMap csvdata = new HashMap<String, ArrayList<String>>();

		
		//get the scanner going
		
		try {
			Scanner scanner = new Scanner(new File("covid417.csv"));
			while(scanner.hasNext()) {
				// System.out.println(scanner.next());
				String nextLine = scanner.nextLine();
				String[] values = nextLine.split(","); //de limiter is ,
				ArrayList<String> rest = new ArrayList<String>();
				rest.add(values[1]);
				rest.add(values[2]);
				rest.add(values[3]);
				rest.add(values[4]);
				rest.add(values[5]);
				
				csvdata.put(values[0], rest);
			}
			System.out.println(csvdata); // print the data
		}catch(Exception e) {
			System.out.print(e);
		}
		
		
		
	}
}
