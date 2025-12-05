package FAANG_Quality_Architecture;

public class App {
    public static void main(String [] args){

        // Thermal printer with decorators
        PrinterStrategy thermalPrinter =
                new LoggingPrinterDecorator(
                        new RetryPrinterDecorator(
                                new ThermalPrinter()
                        )
                );
        PrintManager manager = new PrintManager(thermalPrinter);
        // Laser printer without decorators

        PrinterStrategy laserPrinter = new LaserPrinter();
        PrintManager managerLaser = new PrintManager(laserPrinter);
        // Labels

        Printable barcode = new Barcode("ABC - 12345");
        Printable qr = new QRCode("https://www.auca.kg/");
        Printable shipping = new ShippingLabel("Kyrgyzstan, Kadamzhay");

        // Switch printer dynamically
        manager.setPrinter(new LaserPrinter());
        manager.submit(shipping); // now uses LaserPrinter

// Submit to printers
        manager.submit(barcode);
        manager.submit(qr);
        manager.submit(shipping);

        managerLaser.submit(shipping);//test LaserPrinter



    }
}
