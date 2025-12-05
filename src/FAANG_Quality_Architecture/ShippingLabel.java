package FAANG_Quality_Architecture;

public class ShippingLabel implements Printable{
    private final String address;

    public ShippingLabel (String address){
        this.address = address;
    }

    @Override
    public String content(){
        return "SHIP TO " + address;
    }
}
