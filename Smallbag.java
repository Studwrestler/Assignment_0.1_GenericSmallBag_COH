/**
 * In this class you will be able to instantiate it in the application class and create a small bag
 * @author Chase Hall
 * @version 8/27/23
 * CS215_Assignement_0.1_COH
 * Fall 2023
 * 
 */
public class Smallbag<T> {
	private Item<T> item;//will be used to put something in the bag
	/**
	 * tells you the Item
	 * @return the current item
	 */

	public Item<T> getItem() {
		return item;
	}//end getItem
	/**
	 * allows you to change the Item
	 * @param item the item to be set
	 */
	public void setItem(Item<T> item) {
		this.item = item;
	}//end setItem

}//end class
