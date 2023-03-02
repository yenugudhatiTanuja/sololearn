package sololearn;

 class Counter {
	public static int count=0;
	Counter()
	{
		count++;
	}
}
public class CounterPro
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Counter c1=new Counter();
       Counter c2=new Counter();
       System.out.println(Counter.count);
	}

}
