
public class Application {

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
	}

}
