package April26;

public class FormatterFactory {

    public static Formatter getFormatter(String name) {
        switch (name) {
            case"UpperCaseFormatter":
                return new UpperCaseFormatter();
            case "LowerCaseFormatter":
                return new LowerCaseFormatter();
            case "DashFormatter":
                return new DashFormatter();
            case "ReverseFormatter"":
                    return new ReverseFormatter();
            case "CamelCaseFormatter"":
                    return new CamelCaseFormatter();

            default:
                throw new IllegalArgumentException("Unkown fomatter: " name);
            //14:34

        }
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
