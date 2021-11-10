package sakshigothal;

import java.util.*;

public class CollectionExample {
public static void main(String[] args) {
	List li=new ArrayList();
	li.add("virat");
	li.add(1);
	li.add("134567893");
	li.add("mumbai");
	li.add("abc");
	
	Iterator it=li.iterator();
	System.out.println(li.get(0));
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
}
}
