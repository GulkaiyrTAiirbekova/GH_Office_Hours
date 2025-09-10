package April26;

public class CamelCaseFormatter  implements Formatter{
    @Override
    public String format(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        StringBuilder result = new StringBuilder();// 28:55
        boolean capitalizeNext = false;
                  a,b,c,d,s,f
        abcdsf=6 [0,1,2,3,4,5]

        for (int i = 0; i < input.length(); i++){
            char c =  input.charAt(i);

            if (c== ' '){
                capitalizeNext = true;
            } else {
                if (i ==0) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}

