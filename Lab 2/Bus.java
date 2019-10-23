
public class Bus extends Vehicle{
    public Bus ()
    {
      type = "Bus";
      wheels = 6;
      topSpeed = 80;
      currentSpeed = 0;
    
      System.out.println(type + wheels + topSpeed + currentSpeed);
    }
    
    
    
    @Override
    int accelerate(int currentSpeed, int topSpeed){
      currentSpeed = topSpeed;
      System.out.println(currentSpeed);
    }  
    
    @Override
    int stop(int currentSpeed){
      currentSpeed = 0;
    System.out.println(currentSpeed);
    }
    }
    