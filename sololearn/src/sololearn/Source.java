package sololearn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Credentials
{
	String userName;
	String password;
	public Credentials(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password; 
	}
	
}
class Implementation
{
	String passwordValidator(Credentials details) throws LengthMismatchException, MissingCharacterException
	{
		 if (!((details.password.length() >= 8)
	              && (details.password.length() <= 40))) {
	            throw new LengthMismatchException("minimum length"); 
	       }
		Pattern p= Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@%&*#$]).{8,40}$");
		Matcher m=p.matcher(details.password);
     	boolean s=m.matches();
		if(!s)
		{
			throw new MissingCharacterException("minium password criteria");
		}
		return "valid password";
 		
	}
	String signUp(Credentials details) throws LengthMismatchException
	{
		try
		{
			passwordValidator(details);
		}
		catch(MissingCharacterException e)
		{
			return "Inavlid password";
		}
		catch(LengthMismatchException ex)
		{
			return "Inavlid password";
		}
		catch(Exception e)
		{
			return "other exception";
		}
		return "signup successfully";
		
	}	
}
class MissingCharacterException extends Exception
{
	public MissingCharacterException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
class LengthMismatchException extends Exception
{
	public LengthMismatchException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
public class Source {

	public static void main(String[] args) throws LengthMismatchException, MissingCharacterException {
		// TODO Auto-generated method stub
		Implementation obj=new Implementation();
		System.out.println(obj.passwordValidator(new Credentials("Steve", "jsdh")));
		System.out.println(obj.signUp(new Credentials("Bob","Aski@1tujs")));

	}

}
