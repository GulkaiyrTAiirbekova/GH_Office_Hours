package April26;

public class LowerCaseFormatter implements Formatter{
    @Override
    public String format(String input) {
        return input.replace(' ', '-');
    }
}
