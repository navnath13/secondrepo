package Abstract;

abstract class Vehicle{
	public abstract void show() ;
	
}

class Scooter extends Vehicle{
	

     public void show() {
    	 System.out.println("Scooter start with click");
     }
}
class Car extends Vehicle{
	public void show() {
		System.out.println("This is this the Car class and car start with key");
	}
}
public class Test {
   public static void main(String[] args) {
     Vehicle v=new Scooter();
     v.show();
     Vehicle c=new Car();
     c.show();

	}
}
