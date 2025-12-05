package FAANG_Quality_Architecture;

public class ThermalPrinter implements PrinterStrategy{
    @Override
    public void print(Printable printable){
        System.out.println("[Thermal] Printing -> " + printable.content());
    }
}
