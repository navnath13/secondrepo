package ooppratice;


class School{
   public void school() {
	   System.out.println("this is the school class method");
   }
}


class Teacher extends School{

public void display() {
	System.out.println("this is the teacher class methode");
}
}
class Student extends School{  
	
	
public void show() {
	System.out.println("This is the student class method");
}
}

public class heriaricalInheritance {
	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------");
		School sc=new School();
		sc.school();
		//sc.show();
	 //  sc.display();
		System.out.println("-------------------------------------------");
		
		Teacher tc=new Teacher();
		tc.school();
		tc.display();
		//tc.show();
		
		System.out.println("-------------------------------------------");
	   Student st=new Student();
	   st.show();
	   st.school();
	 //  st.display();
		
		
		
		
		
		
	}

}


