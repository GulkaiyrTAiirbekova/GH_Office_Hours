package April26;

public class FormatterFactory {

    public static Formatter getFormatter(String name) {
        //14:34
        return switch (name) {
            case "UpperCaseFormatter" -> new UpperCaseFormatter();
            case "LowerCaseFormatter" -> new LowerCaseFormatter();
            case "DashFormatter" -> new DashFormatter();
            case "ReverseFormatter" ->  new ReverseFormatter();
            case "CamelCaseFormatter" -> new CamelCaseFormatter();
            default -> throw new IllegalArgumentException("Unkown fomatter: " + name);
        };
    }
    // Method to apply multiple formatter in sequence(Bonus)

    public static String applyFormatters(String input, Formatter [] formatters){
        String result = input;
        for (Formatter formatter : formatters {
            result = formatter.format(result);
        }
        return result;
    }

}


