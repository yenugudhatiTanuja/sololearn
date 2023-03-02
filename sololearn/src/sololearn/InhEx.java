package sololearn;
class Animal
{
	protected int legs;
	public void eat()
	{
		System.out.println("Animals eat");
	}
}
class Dog extends Animal
{
	Dog()
	{
		legs=4;
	}
}

public class InhEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Dog d=new Dog();
         d.eat();
         System.out.println(d.legs);
	}

}
