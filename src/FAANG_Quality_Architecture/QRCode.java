package FAANG_Quality_Architecture;

public class QRCode implements Printable{
    private final String data;

    public QRCode (String data){
        if (data == null || data.isBlank())
            throw new IllegalArgumentException("Invalid QR data");
        this.data = data;
    }

    @Override
    public String content() {
        return "QRCODE: " + data;
    }
}
