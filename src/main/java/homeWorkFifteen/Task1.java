package homeWorkFifteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task1 {
    public static void main(String[] args) {
        String numberText = "(123) 456-7890";
        String reg = "^\\((\\d{3})\\) (\\d{3}-\\d{4})$";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(numberText);
        if (matcher.find()) {
            System.out.println("Valid phone number.");
            String cityCode = matcher.group(1);
            String mainNumber = matcher.group(2);
            System.out.println(String.format("City code: %s.", cityCode));
            System.out.println(String.format("Main number: %s.", mainNumber));
        } else {
            System.out.println("Invalid phone number");
        }
    }
}
