package April23.printing;

public class Document implemenets Printable {
    private String filename;

    public Document(String filename){
        this.filename = filename;
    };
    @Override
    public void print() {
        System.out.println("Printing document: " + filename)
    }
}
