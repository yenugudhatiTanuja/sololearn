package sololearn;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=s.nextInt();
        System.out.println("enter array elements");
        int arr[]=new int[n];
        int arr1[]=new int[n];
        int count=0;
        //String temp=null;
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        }
        System.out.println("the elements in arr--->");
        for(int i=0;i<n;i++)
        {
        	System.out.print(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            arr1[i]=arr[i];
        }
        System.out.println("\nthe elements in arr1--->");
        for(int i=0;i<n;i++)
        {
        	System.out.print(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("\nafter sorting arr is--->");
        for(int i=0;i<n;i++)
        {
        	System.out.print(arr[i]);
        }
        System.out.println("\nsame or not");
        for(int i=0;i<n;i++)
        {
               //count=0;
            if(arr[i]==arr1[i])
            {
                count++;
            }
            
        }
        System.out.println("count is---->"+count);

        
	}

}
