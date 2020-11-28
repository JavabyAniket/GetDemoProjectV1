import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
	
public static void main(String[] args) {
		
		// Declaration
		// ArrayList<String> s = new ArrayList<String>(); // support the homogeneous
		// data in wrapper class
		// ArrayList<Integer> i = new ArrayList<Integer>(); // support the homogeneous
		// data in wrapper class
		// List l = new ArrayList(); // upcast
		ArrayList al = new ArrayList(); // support heterogeneous data main any type of value
		// add new element
		al.add(15);
		al.add("welocome");
		al.add(2020);
		al.add(15.5);
		al.add("A");
// hello guys	  hiiiiii	

		System.out.println(al);
		// size of Arrylist
		System.out.println("no of index " + al.size());
		
		// remove method
		al.remove(2);
      	System.out.println(al);

		// Inert a data
		al.add(2, 2021);
		System.out.println("add the data in array list" + al);
		// Retried the specific element
	
      	System.out.println(al.get(2));
		// change and replace the element
		al.set(2, 2022);
		System.out.println(al);
		
		// search // contains
		System.out.println(al.contains("welocome"));  
		
		// is empty
		System.out.println(al.isEmpty());

		Iterator it = al.iterator();
		
		while (it.hasNext()) {
		System.out.println(it.next());
		}

	}
}
 