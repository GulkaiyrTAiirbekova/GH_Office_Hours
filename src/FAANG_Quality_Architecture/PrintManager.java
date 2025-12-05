package FAANG_Quality_Architecture;

public class PrintManager {
    private PrinterStrategy printer;

    public PrintManager(PrinterStrategy printer){
        this.printer = printer;
    }

    public void setPrinter(PrinterStrategy printer){
        this.printer = printer;
    }

    public void submit(Printable printable){
        printer.print(printable);
    }
}
