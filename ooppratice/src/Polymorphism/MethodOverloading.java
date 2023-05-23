package Polymorphism;

public class MethodOverloading {
	public void display() {
		System.out.println("this is the display method");
	}
	
	public void display(int a) {
		System.out.println("this is the second display method");
	}
	
	public void display(String a) {
		
		System.out.println("This the String method");
	}
	
	public void display(String a, String b) {
		System.out.println("This the String String method");
		
	}
	public void display(int a, int b) {
		System.out.println("this is the int int method");
	}
	
	public void display(int a,String b) {
		System.out.println("This is the int String method");
	}
	
	public void display(String a,int b) {
		System.out.println("This is the String int method");
	}
	public static void main(String args[]) {
		System.out.println("hello programmer");
		
		MethodOverloading mo=new MethodOverloading();
		mo.display();
		mo.display(2);
		mo.display("hello");
		mo.display(20, 20);
		mo.display(2, "vishal");
		mo.display("navnath", 3);
		mo.display("vishal", "navnalt");
	}

}
