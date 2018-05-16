package dilip;

public interface loosecouple {
	
	void eat();

}
 class Cat implements loosecouple{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("cat i s eating");
	}
	 
 }
 class Dog implements loosecouple{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog i s eating");
	}
	 
 }
 class test{
	 public static void main(String[] args) {
		loosecouple l= new Cat();
		l.eat();
	}
 }