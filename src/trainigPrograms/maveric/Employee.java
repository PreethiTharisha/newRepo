package trainigPrograms.maveric;

public class Employee { 
	
public static void main(String[] args) {  
	
	TestEmployee e1=TestEmployee.getInstance(); //objects
	
	
	TestEmployee e2=TestEmployee.getInstance();  
	
	
	/*TestEmployee e3=new TestEmployee(); 
	
	TestEmployee e4=new TestEmployee();*/ 
	
    e1.insert(101,"Ram",45000);  
    e2.insert(102,"Sham",25000);  
   // e3.insert(103,"Naveen",55000);  
    e1.display();  
    e2.display();  
   // e3.display(); 
    
    System.out.println(e1.hashCode());
    System.out.println(e2.hashCode());
} 

}
 
class TestEmployee{  
	
    int id;  
    String name;  
    float salary;  
    
    private int point=10;
    
    private TestEmployee() {
    	
    }
    
    private static TestEmployee employee=null;
    
    public static TestEmployee getInstance() {
    	
    	if(employee==null)
    		employee=new TestEmployee();
    	
    	return employee;
    	
    }
    
    void insert(int i, String n, float s) {  
        id=i;  
        name=n;  
        salary=s; 
        point=id;
    }  
    
    void display(){System.out.println(id+" "+name+" "+salary);} 
    
    
} 
