package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
	
		
		displayHashSet();
		displayLinkedHashSet();
		displayTreeSet();
	}

	private static void displayTreeSet() {
		Set<String> li=new TreeSet<String>();
		li.add("vishal");
		li.add("rahul");
		li.add("anushka");
		li.add("rahul");
		li.add("rahul");
		System.out.println(li);
		Iterator<String> i=li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
	}

	private static void displayLinkedHashSet() {
		Set<String> st=new  LinkedHashSet <String>();
		st.add("vishal");
		st.add("rahul");
		st.add("anushka");
		st.add("rahul");
		st.add(null);
		System.out.println(st);
		
	}

	private static void displayHashSet() {
		Set<String> st=new HashSet<String>();
		st.add("vishal");
		st.add("vishal");
		st.add("anushka");
		st.add("pooja");
		st.add("anushka");
		st.add(null);
		System.out.println(st);
		System.out.println(st.hashCode());
		
	}
	
	

}
