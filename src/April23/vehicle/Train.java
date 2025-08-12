package April23.vehicle;

public class Train  extends TransportVehicle{
    public Train(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println(name + " is accelerating on track at " + speed + " km/h");
    }
}
