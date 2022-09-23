package javaPackage;

public class EncapsulationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankE obj = new BankE();
		obj.setter(101);
		System.out.println(obj.getter());
	}

}

class BankE
{
 private int id;	
 void setter(int a)
 {
	 id =a;
 }
 
 int getter ()
 {
	return id; 
	 
 }
}