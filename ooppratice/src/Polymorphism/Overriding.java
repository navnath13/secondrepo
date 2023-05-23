package Polymorphism;

public class Overriding extends Second {
	
	public static void main(String[] args) {
		Frist f1=new Frist();
		f1.show();
	Frist f=new Second();
	f.show();
	
	}
	

}

class Frist{
	public void show() {
		System.out.println("this is the first class method");
	}
}

class Second extends Frist{
	public void show() {
		System.out.println("hello java progammer");
		System.out.println("this is the Second class method");
	}
}
