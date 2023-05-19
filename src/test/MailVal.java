package test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MailVal {
	public static void main(String[] args) {
		String mail = "shaiknasheer18@gmail.com";
		String regex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,4})$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher= pattern.matcher(mail);
		if(matcher.matches()) {
			System.out.println("GIVEN MAIL IS VALID:- "+mail);
		} else {
			System.out.println("GIVEN MAIL IS NOT VALID:-"+mail);
		} 
	}
}
