package trainigPrograms.maveric;

public class Vehicle {
	
	final int i=123;
	
	String name;
	
	public void run() {
		
		System.out.println("Preethi");
	}
	public void bike() {
		
		name="Yamaha";
		
	}
	public static void main(String[] args) {
		
		int j=0;
		
		Vehicle obj=new Vehicle();
		
		System.out.println(obj.i);
		System.out.println(j);
		
		obj.run();
		
		System.out.println("Before calling bike method value is "+obj.name);
		
		obj.bike();
		
		System.out.println("After calling bike method value is "+obj.name);
	}
}
