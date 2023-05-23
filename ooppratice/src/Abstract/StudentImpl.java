package Abstract;

public class StudentImpl implements StudentInter,SchoolInter{

	public void show() {
	
		System.out.println("This is interface method");
	}
	
	public static void main(String[] args) {
		StudentImpl st=new StudentImpl();
		st.show();
    
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
