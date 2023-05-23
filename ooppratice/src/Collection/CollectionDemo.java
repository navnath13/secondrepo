package Collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

import Entity.Student;
public class CollectionDemo {
	
	
	  public static void main(String[] args) {
			
		  
      	//	displayList();
		//	displayLinkedList();
		  
		//  displayVector();
		  
		  displayStact();

		  }
	  
	  
	  
	  
	  
	  private static void displayStact() {
		Stack<String> st=new Stack<String>();
		st.add("navnath");
		st.add("vishal");
		st.add("rahul");
		st.add("anushka");
		st.add("aradhya");
		System.out.println(st);
		
	}





	private static void displayVector() {
		  Vector<String> v=new Vector<String>();
	       v.add("ramesh");
	       v.add("rajesh");
	       v.add("rahul");
	       v.add("ronak");
	       
	       v.add("roshani");
	       System.out.println(v);
	}





	public static void displayLinkedList() {
		  LinkedList<String> li=new LinkedList<String>();
		  li.add("Gorakh");
		  li.add("Rahul");
		  li.add("pooja");
		  li.add("rohini");
		  li.add("manju");
		  
		  LinkedList<String>li2=new LinkedList<String>();
		
		  System.out.println("LinkedList collection "+li);
		  System.out.println("--------------------------------------------");
		  li.addFirst("anuska");
	      System.out.println("AddFirst Method "+li);
		  System.out.println("--------------------------------------------");
		  li.addLast("sunil");
		  System.out.println("After addLast Method" +li);
		  System.out.println("--------------------------------------------");
		  System.out.println("contains method");
		  System.out.println(li.contains("Gorakh"));
		  System.out.println("--------------------------------------------");
		  System.out.println(li.peek());
		   li.push("navnath");
		   System.out.println(li);
		   li2.addAll(li);
		  li2.push("cbc");
		  System.out.println(li2);
		System.out.println(li2.peek().toUpperCase().concat("java"));
		
	
		System.out.println(li);
		li2.clear();
	   Iterator<String> i=li.iterator();
	   while(i.hasNext() ) {
		 li2.add(i.next().toUpperCase());
	   }
	   System.out.println(li2);
		Collections.sort(li2);
		System.out.println(li2);
		
		Student st;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("No of student inserted");
		int no=sc.nextInt();
		
		LinkedList<Student> studentList=new LinkedList<Student>();
		
		for(int j=0;j<=no;j++) {
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter Name of Studnet");
			String name=sc.next();
			System.out.println("Enter Student address");
			String address=sc.next();
			
			
			
			
			st=new Student(id,name,address);
			studentList.add(st);
			
		}
		
	System.out.println(studentList);
for(Student st1:studentList) {
	System.out.println(st1.getId()+"   "+st1.getName().toUpperCase()+"    "+st1.getAddress().toUpperCase());
}
	
		 sc.close();
		  
		  
	  }
	
	public  static void displayList(){
		ArrayList<String> li=new ArrayList<String>();
		li.add("Navnath");
		li.add("vishal");
		li.add("Narayan");
		li.add("rahul");
		System.out.println("ArrayList"+li);
		ArrayList<String> li2=new ArrayList<String>();
		li.add("Shankar");
		li.remove(0);
		System.out.println(li);
		li.add(0,"anushka");
		System.out.println(li);
		
   System.out.println(li.contains("Navnath"));
  li2.addAll(li);
  System.out.println(li);
  
	}

	
	

}
