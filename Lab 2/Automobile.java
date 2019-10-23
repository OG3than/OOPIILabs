

public interface Automobile {
   void start();
   void off();
  void accelerate(int a, int b);
   void stop(int a);
 }

 public class Sedan implements Automobile{
 
  int type = "Sedan";
  int wheels = 4;
  int topSpeed = 180;
  int currentSpeed = 0;
  int hP = 100;

  @Override
  public void start(){
   System.out.println("The " + type + " has started.");
  };

  @Override
  public void off(){
   System.out.println("The " + type + " is now off.");
  };  

  @Override
public void accelerate(int currentSpeed, int topSpeed ){
 currentSpeed = topSpeed;
 System.out.println("accelerated to " + currentSpeed + " kph!");
};

@Override
public void stop(int currentSpeed){
 currentSpeed = 0;
 System.out.println("stoped to " + currentSpeed + " kph.");
};
}  