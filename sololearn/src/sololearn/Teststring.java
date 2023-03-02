package sololearn;
class ABC{
	ABC(int x)
	{
		System.out.println("ABC");
	}
}
class XYZ extends ABC{
	XYZ()
	{
		System.out.println("XYZ");

	}
}
/*class Parent
{
	
}
class Child extends Parent{
	
}*/
public class Teststring {

	public static void main(String args[]) {
		/*String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Ratan";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		String s4 = new String("Sachin");
		System.out.println(s1 == s2);
		System.out.println(s1 == s4);
		String s = "SachinTendulkar";
		System.out.println(s.substring(6));
		System.out.println(s.substring(0, 6));*/
		
		/*StringBuffer s=new StringBuffer("Welcom e to BITS pilani");
		int p=s.length();
		int q=s.capacity();
		System.out.println("length of string="+p);
		System.out.println("capacity of string="+q);
        s.setCharAt(23,'s');
        System.out.println("String is"+s);*/
		
        XYZ x=new XYZ();
       /*Parent p=new Parent();
       Child c=new Child();
		System.out.println(p instanceof Child);
		System.out.println(p instanceof Parent);
		System.out.println(c instanceof Parent);
		int x=10,y=5;
		if(x-- >7||++y < 8)
			System.out.println(x);
		System.out.println(y);
		z=x-- >7||++y <8? x: y;
		System.out.println(z);*/

	}

}
