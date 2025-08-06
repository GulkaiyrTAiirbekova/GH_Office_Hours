package April18;

public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println("Starting the vehicle");
    }
    public String getBrand(){
        return brand;
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }

    @Override
    public void start(){
        System.out.println("Starting the car with key");
    }

    public void honk(){ //implrmentation of the method = or  the body of the method
        System.out.println("Beep beep");
    } //line 192
}

class Main {
    public static void main(String [] args){
        Car myCar = new Car("Tayota",4);
        System.out.println("Brand: " +myCar.getBrand()); //Inherited Method
        myCar.start(); //Override method
        myCar.honk();// new method
    }
}

interface Playable {
    void play();
    void pause();
    void stop();
}

interface Recordable {
    void record();
    void saveRecording();
}

interface MusicPlayer implements Playable{
    private String currentSong;


    @Override
    public void play(){
        System.out.println("Playing music");
    }
    @Override
    public void pause(){
        System.out.println("Music paused");
    }
    @Override
    public void stop(){
        System.out.println("Music stopped");
        currentSong= null;
    }
}

class MediaRecorder implements Playable,Recordable {
    private boolean isRecording = false;

    @Override
    public void play(){
        System.out.println("Playing Recordings");
    }
    @Override
    public void pause(){
        System.out.println("Paused playback")
    }
    @Override
    public void stop(){
        System.out.println("Stopped playback");
        if(isRecording){
            isRecording =FALSE//45:36 LINE 254
        }
    }
}
