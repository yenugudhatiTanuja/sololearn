package sololearn;

import java.util.HashSet;

public class Tanu {
		static void cntDistinct(String str)
		{
			
			// Set to store unique characters
			// in the given string
			HashSet<Character> v = new HashSet<Character>();
			HashSet<Character> c = new HashSet<Character>();


			// Loop to traverse the string
			for(int i = 0; i < str.length(); i++)
			{
				 
			        char ch = str.charAt(i);
			         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			         {
			            //int vowel;
						//vowel++;
			           // System.out.println(ch+"is vowel");
			        	 v.add(ch);
			         }
			         else
			         {
			            //consonant++;
			            //System.out.println(ch+"is consonant");
			        	 c.add(ch);
			         }

				// Insert current character
				// into the set
				//s.add(str.charAt(i));
			        //s.add(ch);
			}

			// Return Answer
			System.out.println(v.size());
			System.out.println(c.size());

		}
   public static void main(String args[])
   {
	   String str = "abcdabcd";
	   cntDistinct(str);
   }
}

//This code is contributed by sanjoy_62
