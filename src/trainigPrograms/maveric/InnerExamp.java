package trainigPrograms.maveric;
 
class InnerExamp{  
 private int data=30;  
 
 class Inner{  
  void msg(){System.out.println("data is "+data);}  
 } 
 
 public static void main(String args[]){
	 
	 InnerExamp obj=new InnerExamp();  
	 InnerExamp.Inner in=obj.new Inner();  
     in.msg();  
     
 }  
}
