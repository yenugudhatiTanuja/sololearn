package sololearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it does not work with index
       Collection values=new ArrayList();//It store all type of objects (generic)
       values.add(7); //int
       values.add(4); //int
       values.add(5); //int
       values.add("tanu"); //string
       values.add(55.50); //float
       values.add('c');   //character
       System.out.println(values); //it display all the elements
       Iterator it=values.iterator();//it iterates the individual elements 
       while(it.hasNext())//hasnext() method tells the next element present or not
       {
       System.out.println(it.next());//next() is a method it prints the next element
       }
	}

}
