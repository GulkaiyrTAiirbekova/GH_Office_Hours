package April23.printing;

public class Photo  implememnts Printable{
    private String description;

    public Photo (String description) {
        this.description= description;
    }

    @Override
    public void print(){
        System.out.println("Photo printed in color: " + description);
    }
}
