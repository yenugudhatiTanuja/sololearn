import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String input="jsdhJS12*&$1";
       Pattern p= Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@%&*#$]).{8,40}$");
       Matcher m=p.matcher(input);
       System.out.println(m.matches());
		/*Scanner s=new Scanner(System.in);	
		String password = s.nextLine();
		String regex = "(?=.*[0-9])"
				+ "(?=.*[a-z])(?=.*[A-Z])"
				+ "(?=.*[@#$%^&+=]).{8,20}$";

	Pattern p = Pattern.compile(regex);
	Matcher m = p.matcher(password);
	System.out.println(m.matches());*/
	
	}

}
