import java.utils.*;

public abstract class Vehicle{  
  public int wheels;
    public int topSpeed;
    public int currentSpeed;
    public String type; 
  
  public abstract int accelerate(int currentSpeed, int maxspeed);
    public abstract void gas();
    public abstract void brake();
    public abstract int stop(int b);  
  }  

  

    


