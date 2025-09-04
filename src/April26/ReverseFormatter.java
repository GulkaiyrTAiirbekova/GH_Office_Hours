package April26;

public class ReverseFormatter  implements Formatter{
    @override
    public String format (String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
//asd=> dsa
