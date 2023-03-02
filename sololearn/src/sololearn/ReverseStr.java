package sololearn;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		char[] arr=text.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}
}
