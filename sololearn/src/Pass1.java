
public class Pass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Pass1 p=new Pass1();
    p.start();
	}

	 void start() {
		// TODO Auto-generated method stub
		String s1="slip";
		String s2=fix(s1);
		System.out.println(s1+" "+s2);
	}

	 String fix(String s1) {
		// TODO Auto-generated method stub
		 s1=s1+"stream";
		 System.out.print(s1+" ");
		return "stream";
	}

}
