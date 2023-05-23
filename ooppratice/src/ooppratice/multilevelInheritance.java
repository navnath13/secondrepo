package ooppratice;



//this is the multilevel inheritance
class Superclass{
    int age=98;
    public void display() {
    	System.out.println("I am super class");
    }
    
}
class ParentClass extends Superclass{
	public void show() {
		System.out.println("I am parent class");
	}
	
}
class ChildClass  extends ParentClass{
	public void displayChild(){
		System.out.println("This is the child class method");
	}
	
}



public class multilevelInheritance {
	
	
	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------");
		Superclass sc=new Superclass();
		sc.display();
		//sc.show();
		//sc.displayChild();
		System.out.println("--------------------------------------------------");
		ParentClass ps=new ParentClass();
		ps.display();
		ps.show();
		//ps.displayChild();
		System.out.println("--------------------------------------------------");
		ChildClass cc=new ChildClass();
		cc.show();
		cc.display();
		cc.displayChild();
	}

}
