/**
 * 
 */
package example;

/**
 * @author acer
 *
 */
public class ex2 extends ex1{
	
	public int print() {
		System.out.println("hello shweta");
		return c;
	}
	
	public static void main(String args[]) {
		ex1 output1 = new ex1();
		ex2 output2 = new ex2();
		output1.print();
		output2.print();
	}

}
