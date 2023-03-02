package sololearn;

import java.util.Scanner;

public class DoVowCo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		String str1;
	      char ch;
	      int len, i, vowel=0, consonant=0;
	      Scanner s = new Scanner(System.in);
	      System.out.print("Enter the String: ");
	      str1 = s.nextLine();
	      str=str1.toLowerCase();
	      len = str.length();
	      for(i=0; i<len; i++)
	      {
	         ch = str.charAt(i);
	         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y'||ch=='z')
	         {
	            vowel++;
	            System.out.println(ch+"is vowel");
	         }
	         else
	         {
	            consonant++;
	            System.out.println(ch+"is consonant");
	         }

	      }
	      
	      System.out.println("\nTotal Vowels = " +vowel);
	      System.out.println("Total Consonants = " +consonant);
	}

}
