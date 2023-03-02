package sololearn;
class Candidate
{
	String name;
	int totalRating;
	int totalcontest;
	public Candidate(String name, int totalRating, int totalcontest) {
		super();
		this.name = name;
		this.totalRating = totalRating;
		this.totalcontest = totalcontest;
	}
	
}
class validator 
{ 

	public String eligible(Candidate c) throws Exception
	{
	 if(c.totalRating<1000)
	  {		  
	   throw new CritiriaMisMatchException("minimun 1000 required");
	  }
	 if(c.totalcontest<10)
	  {
		  throw new CritiriaMisMatchException("minimum 10 requried"); 
	  }
	return "eligible  candidate";
		
	}
	public String sendInvitation(Candidate c)
	{
		try {
			eligible(c );
		}catch(CritiriaMisMatchException ex) {
			return "Candidate is Not eligible";
		}catch(Exception ex) {
			return "Other Exception";
		}
		return "Invitation send";		
		
	}
}
class CritiriaMisMatchException extends Exception
{
	public CritiriaMisMatchException(String message)
	{
		super(message);
	}
}
public class MainP {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    Candidate c=new Candidate("tanuja", 1023, 23);
    validator v=new validator();
    System.out.println(v.eligible(c));
  System.out.println(v.sendInvitation(c));
	}

}
