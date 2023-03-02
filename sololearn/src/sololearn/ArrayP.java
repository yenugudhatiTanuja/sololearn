package sololearn;

import java.util.Scanner;

public class ArrayP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****integer array****");
		Scanner s=new Scanner(System.in);
		int n,m;
		//int arr[][] = new arr[n][m];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
		 //     arr[i][j]=s.nextInt();
			}
		}
	   // int arr[][]= {{1,2,3},{3,4,5}};
       // int x=arr[1][0];
       // System.out.println(x);
        System.out.println("****char array****");
        char arr1[][]= {{'a','b','c'},{'d','e','f'}};
        char y=arr1[1][0];
        System.out.println(y);
        System.out.println("****String array****");
        String arr2[][]= {{"hii","hello","bye"},{"red","green","blue"}};
        String z=arr2[1][1];
        System.out.println(z);
		
	}

}
