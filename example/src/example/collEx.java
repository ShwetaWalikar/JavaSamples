/**
 * 
 */
package example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acer
 *
 */
public class collEx {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add("hi");
		l1.add("hello");
		System.out.println(l1);
		List l2 = new ArrayList();
		l2.add("hey");
		l2.addAll(l1); // prints in one list
		// l2.add(l1); // prints l1 list as one object
		//  l2.add(0,l1); // l1 list prints as second object means in 0th index
		// l2.add(1, l1); // l1 list prints as second object means in 1st index
		System.out.println(l2);
	}

}
