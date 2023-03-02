package sololearn;

import java.util.Scanner;

public class Ep {
	 public static void printDistinctCharacters(char[] arr){
           int vcount=0;int ccount = 0;
	        for(int i=0;i<arr.length;i++){
	            boolean isDistinct = false;
	            for(int j=0;j<i;j++){
	                if(arr[i] == arr[j]){
	                    isDistinct = true;
	                    break;
	                }
	            }
	            if(!isDistinct){
	            	System.out.println("*************************");
	                System.out.print(arr[i]+" ");
	            	System.out.println("*************************");

	                for(i=0; i<arr.length; i++)
	      	        {
	                	if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
	       	         {
	       	            //int vowel;
						vcount++;
	       	            //System.out.println(ch+"is vowel");
	       	         }
	       	         else
	       	         {
	       	            ccount++;
	       	         }
	      	      }
	               System.out.println("----->"+vcount);
	               System.out.println("----->"+ccount);

	            }
	        }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the required String: ");
	      String str = sc.next();
	     // System.out.println("Enter the required character: ");
	    //  char ch = sc.next().toCharArray()[0];
	      //Converting the String to char array
	      char arr[] = str.toCharArray();
	      Ep.printDistinctCharacters(arr);
	}

}
