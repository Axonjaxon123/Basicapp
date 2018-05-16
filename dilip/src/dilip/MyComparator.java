package dilip;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MyComparator implements Comparator{
Map map;
	public MyComparator(Map map) {
		// TODO Auto-generated constructor stub
		this.map=map;
	}
	public int compare(Object o1, Object o2)
	{
		
		return ((Integer)map.get(o2)).compareTo((Integer)map.get(o1));
		
	}

}
