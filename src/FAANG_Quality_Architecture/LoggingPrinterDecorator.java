package FAANG_Quality_Architecture;

public class LoggingPrinterDecorator implements PrinterStrategy {

    private final PrinterStrategy wrapped;

    public LoggingPrinterDecorator(PrinterStrategy wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void print(Printable printable) {
        System.out.println("[LOG] Request to print: " + printable.content());
        wrapped.print(printable);
    }
}

