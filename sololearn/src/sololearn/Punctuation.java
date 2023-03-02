package sololearn;

import java.util.Scanner;

class Homep
{
	public int countPunctuation(String str)
	{
        int countPuncMarks=0;

		try
		{
       
        //int countPuncMarks=0;

	    int len = str.length();
		for(int i=0; i<len; i++)
	      {
	       char ch = str.charAt(i);
	       if(str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '!' || str.charAt(i) == ',' ||   
                   str.charAt(i) == ';') {  
               //int countPuncMarks=0;
			countPuncMarks++;  
           }  
	    }
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return countPuncMarks;
		
	}
	//return countPuncMarks;

}
public class Punctuation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	System.out.println("Enter your string");
    Scanner s=new Scanner(System.in);
    //s.nextLine();
    String str=s.nextLine();
    Homep st=new Homep();
    System.out.println(st.countPunctuation(str));
	}
	/*catch(Exception e)
	{
		System.out.println(e);
	}*/
    //Homep st=new Homep();
    //System.out.println(st.countPunctuation(str));
	//}

}
