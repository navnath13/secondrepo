package forPattern;

public class Test {
	
	public static void main(String[] args) {
		/*
		 * System.out.println("hello java progammer"); displayPattern(4);
		 * System.out.println("----------------------------------------------------");
		 * Rectangle(6);
		 * System.out.println("----------------------------------------------------");
		 * inverTractangle(5);
		 * System.out.println("----------------------------------------------------");
		 * 
		 */
		
	//	holoRegInver(6);
	
		
reactangle(10);
		
		
	}
	
	
	
	
	public static void reactangle(int no) {
		for(int i=0;i<no;i++) {
			for(int j=no;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void holoRegInver(int no) {
	
		for(int i=0;i<no;i++) {
			for(int j=0;j<no;j++) {
			if(j+i<no-1) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
			}
			System.out.println();
		}

	}
	
	public static void inverTractangle(int no) {
		for(int i=0;i<no;i++) {
			for(int j=no;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Rectangle(int no) {
		for(int i=0;i<no;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void displayPattern(int no) {
		for(int i=0;i<no;i++) {
			for(int j=0;j<no;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}



