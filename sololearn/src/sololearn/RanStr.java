package sololearn;

import java.util.Random;

public class RanStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    char ch;
	     int len, i, vowel=0, consonant=0;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for ( i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String str = buffer.toString();

	    System.out.println(str);
	    len = str.length();
	      for(i=0; i<len; i++)
	      {
	         ch = str.charAt(i);
	         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	         {
	            vowel++;
	            System.out.println(ch+"is vowel");
	         }
	         else
	            consonant++;
	      }
	      
	      System.out.println("\nTotal Vowels = " +vowel);
	      System.out.println("Total Consonants = " +consonant);
	}

}
