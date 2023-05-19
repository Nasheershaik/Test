package test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Phno {
    public static void main(String[] args) {
        String phone= "8555064593"; 
        String regexPattern = "^\\+?\\d{1,3}[\\s-]?\\d{9,10}$";
        
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(phone);
        boolean isValid = matcher.matches();
        if (isValid) {
            System.out.println("The phone number is valid");
        } else {
            System.out.println("The phone number is invalid");
        }
    }
}