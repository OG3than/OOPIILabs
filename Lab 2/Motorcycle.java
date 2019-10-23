

public class Motorcycle extends Vehicle{
    public Motorcycle ()
    {
      type = "Motorcycle";
      wheels = 2;
      topSpeed = 240;
      currentSpeed = 0;
    
      System.out.println(type + wheels + topSpeed + currentSpeed);
    }
    }