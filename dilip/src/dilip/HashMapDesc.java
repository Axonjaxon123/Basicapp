package dilip;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDesc {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> hm=new HashMap< String,Integer>();
		
		hm.put("A",1 );
		hm.put("B",3);
		hm.put( "C",5);
		hm.put( "D",2);
		
		MyComparator r=new MyComparator(hm);
		Map<String,Integer> m= new TreeMap(r);
		m.putAll(hm);
		System.out.println(m);
		Map<String,Integer> m1= new TreeMap(hm);
		System.out.println(m1);
	}

}
