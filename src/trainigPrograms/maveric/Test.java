package trainigPrograms.maveric;

class Vehicle1{
    public void move(){
    System.out.println("Vehicles can move!!");
    }
   }
class MotorBike extends Vehicle1{
    public void move(){
    System.out.println("MotorBike can move and accelerate too!!");
    }
   }
class Test{
    public static void main(String[] args){
    Vehicle1 vh=new MotorBike();
    vh.move();    // prints MotorBike can move and accelerate too!!
    vh=new Vehicle1();
    vh.move();    // prints Vehicles can move!!
    }
   }

