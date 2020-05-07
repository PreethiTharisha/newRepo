package trainigPrograms.maveric;

class ExceptionExamp {
	   public static void main(String args[]) {
	      int x =0;
	      
	      int y = 10;
	      
	      try {
	      int z = y/x;//10/0 exception
	      }
	      catch(Exception e) {
	    	  
	      }
	     finally {
	    	 System.out.println("x value is"+x);	 
	     }
	      
	      
	  }
	   
}

