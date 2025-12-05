package FAANG_Quality_Architecture;

public class Barcode  implements Printable{
    private final String code;

    public Barcode(String code){
        if(code == null || code.isBlank())
            throw new IllegalArgumentException("Invalid barcode");
        this.code = code;
    }

    @Override
    public String content(){
        return "BARCODE" + code;
    }
}
