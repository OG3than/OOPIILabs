

public class Main {
public static void main(String[] args)
{
    Vehicle sedan1 = new Sedan();
    sedan1.currentSpeed = 10;
    sedan1.topspeed = 180;
    sedan1.accelerate(currentSpeed, topSpeed);
    sedan1.stop(currentSpeed);
}
}