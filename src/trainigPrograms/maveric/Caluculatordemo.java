package trainigPrograms.maveric;

public class Caluculatordemo extends MyCalculation{
	
	
	
	 public void setDate() {
  	   
  	   name="multiplication";
  	   System.out.println("Operation is:"+name);  
	   }

	   public static void main(String args[]) {
	      int a = 20, b = 10;
	      
	      Caluculatordemo demo = new Caluculatordemo();
	      
	      demo.addition(a, b);
	      demo.Subtraction(a, b);
	      demo.multiplication(a, b);
	      demo.setDate();
	   }
	   

}
