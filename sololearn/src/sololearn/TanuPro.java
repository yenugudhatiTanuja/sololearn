package sololearn;

import java.util.HashSet;

class Alphabet
{
	int uniqueVowel(String str)
	{
		HashSet<Character> v = new HashSet<Character>();
		for(int i = 0; i < str.length(); i++)
		{
			 
		        char ch = str.charAt(i);
		         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		         {
		        	 v.add(ch);
		         }
		}
		return v.size();
		
	}
	int uniqueConsonant(String str)
	{
		HashSet<Character> c = new HashSet<Character>();
		for(int i = 0; i < str.length(); i++)
		{
			 
		        char ch = str.charAt(i);
		         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		         {
		            
		         }
		         else
		         {
		            
		        	 c.add(ch);
		         }
		}

		return c.size();
		
	}
}
public class TanuPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Alphabet obj=new Alphabet();
  int s= obj.uniqueVowel("abacab");
  int o=  obj.uniqueConsonant("abacab");
  System.out.println(s);
  System.out.println(o);
  
	}

}
