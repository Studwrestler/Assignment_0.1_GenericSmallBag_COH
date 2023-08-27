/**
 * In this class you will be able to instantiate it in the application class and create an Item of any type
 * @author Chase Hall
 * @version 8/27/23
 * CS215_Assignement_0.1_COH
 * Fall 2023
 * 
 */
public class Item<T> {
	private T e;// will used to create the item type
	
	/**
	 * tells you the Item type
	 * @return the current item type
	 */

	public T getE() {
		return e;
	}//end getE
	/**
	 * allows you to change the Item type
	 * @param e the item type to be set
	 */

	public void setE(T e) {
		this.e = e;
	}//end setE
	

}//end class
