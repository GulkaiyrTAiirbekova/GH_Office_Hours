package April23.vehicle;

public class Bicycle  extends TransportVehicle{
    public bycicle (String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move(){
        System.out.println(name + " is pedaling at " + speed + "km/h ...");
    }
} //35:51
