package April23.vehicle;

public  abstract class  TransportVehicle {
    protected String name;
    protected int speed;

    public TransportVehicle(String name,int speed) { //constructor
        this.name = name;
        this.speed =speed;
    }

    public void start(){ //void just prints
        System.out.println(name+ " has started.");
    }
    public abstract void move(); //method "move"
}

//Train train = new Train ["par", 120];
//extends has more functions



