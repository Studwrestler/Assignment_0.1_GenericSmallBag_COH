/**
 * This class allows you to create a small bag with items
 * @author Chase Hall
 * @version 8/27/23
 * CS215_Assignement_0.1_COH
 * Fall 2023
 * 
 */
public class Application {
	/**
	 * Default
	 */
	Application(){
		
	}
/**
 * Main loop of application
 * @param args arguments of main method
 */

	public static void main(String[] args) {
		Item<String> s = new Item<>();
		s.setE("Chase Hall");
		
		Item<Integer> i= new Item<>();
		i.setE(19);
		
		Smallbag<String> bag = new Smallbag<>();
		bag.setItem(s);
		
		Item<String> rs = bag.getItem();
		System.out.println(rs.getE());
		
		Smallbag<Integer> bag1 = new Smallbag<>();
	    bag1.setItem(i);
	    
	    Item<Integer> ri = bag1.getItem();
		System.out.println(ri.getE());
	}//end main

}//end class
