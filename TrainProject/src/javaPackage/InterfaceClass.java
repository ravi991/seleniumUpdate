package javaPackage;

public class InterfaceClass implements Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass obj=new InterfaceClass();
		obj.add();
		obj.mutiple();
		obj.subt();
		obj.division();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
	System.out.println("This is add method");	
	}

	@Override
	public void subt() {
		// TODO Auto-generated method stub
		System.out.println("This is subt method");		
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("This is division method");	
	}

	@Override
	public void mutiple() {
		// TODO Auto-generated method stub
		System.out.println("This is mutiple method");	
	}

}


interface Calculator 
{
	void add();
	void subt();
	void division();
	void mutiple();
}