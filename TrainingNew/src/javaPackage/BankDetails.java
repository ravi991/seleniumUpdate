package javaPackage;

public class BankDetails implements Bank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj= new BankDetails();
		obj.bankName();
		obj.accountHolderName();
	}
	@Override
	public void bankName() {
		// TODO Auto-generated method stub
		System.out.println("The name of bank "+bankName);
	}

	@Override
	public void accountHolderName() {
		// TODO Auto-generated method stub
		System.out.println("The name of account holder "+name);
	}
}

interface Bank
{
	String bankName="Citigroup";
	String name="Harry";
	void bankName();
	void accountHolderName();
	
}