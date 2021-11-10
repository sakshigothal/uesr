package sakshigothal;

//import java.util.LinkedHashMap;
import java.util.*;

public class MapEx {//collection example
	public static void main(String[] args) {
		Map<Integer, String> map=new LinkedHashMap<Integer, String>();
		map.put(1, "sakshi");
		map.put(2, "gothal");
		map.put(3, "ghja");
		map.put(4, "ghdfsuy");
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		Set set = map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
