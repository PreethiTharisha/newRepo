package trainigPrograms.maveric;

public class Demo1 {
	
	int id=100;
	
	 static String name="empName";
	
	static {
		int i=0;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static void getData() {
		
	}

}

class demo2{
	
	public void get() {
		
		Demo1 demo=new Demo1();
		
		System.out.print(Demo1.name);//empName
		Demo1.name="emp";
		
		Demo1.getData();
		
		System.out.println();//emp
		
	}
}
