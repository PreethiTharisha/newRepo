package trainigPrograms.maveric;

public  class ExampleFinal {
	
	final int interestRate=15;
	
	String s="100";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ExampleFinal obj=new ExampleFinal();
		
		System.out.println(obj.interestRate);
		
		//obj.interestRate=20;
		
		System.out.print(obj.interestRate);

	}
	
	private final void getData() {
		
	}

}

class example extends ExampleFinal{
	
	private void getDate() {
		
		ExampleFinal obj=new ExampleFinal();
		
		//System.out.print(interestRate);
		
	}

}
