package FAANG_Quality_Architecture;

public class LaserPrinter implements PrinterStrategy{
    @Override
    public void print(Printable printable){
        System.out.println("[Laser] Printing -> " + printable.content());
    }
}
