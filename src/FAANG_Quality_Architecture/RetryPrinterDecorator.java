package FAANG_Quality_Architecture;

public class RetryPrinterDecorator implements PrinterStrategy{
    private final PrinterStrategy wrapped;

    public RetryPrinterDecorator(PrinterStrategy wrapped){
        this.wrapped= wrapped;
    }

    @Override

    public void print(Printable printable){
        int attempts = 3;
        while(attempts --> 0){
            try{
                wrapped.print(printable);
                return;
            } catch (Exception e) {
                if(attempts == 0 ) throw  e;
            }
        }
    }
}
