package April26;
//implement = must "@Override"
public class UpperCaseFormatter implements Formatter{
    @Override
    public String format(String input) {
        return input.toUpperCase();
    }
}
