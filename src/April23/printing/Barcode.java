package April23.printing;

public class Barcode impelements Printable {
    private String code;

    public Barcode(String code) {
        this.code = code;
    }

    @Override
    public void print(){
        System.out.println("Barcode " + code + " sent to label printer");
    }
}
