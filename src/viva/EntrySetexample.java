package viva;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetexample {

	public static void main(String[] args) {
	Map<Integer, String>s= new HashMap<Integer, String>(); 
		s.put(1, "sirisha");
		s.put(2, "automation");
		for(Entry<Integer,String> b:s.entrySet()) {
			System.out.println(b);
		}
		 
		Iterator<Entry<Integer, String>> b=s.entrySet().iterator();
		while( b.hasNext()) {
			Entry<Integer,String>c=b.next();
			System.out.println(c.getKey() +" " + c.getValue());
		}
	}

}
