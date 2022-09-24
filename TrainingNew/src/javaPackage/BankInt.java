package javaPackage;

public interface BankInt {
	String bankName="Citigroup";
	String name="Harry";
	void bankName();
	void accountHolderName();
}

 class BankDet implements BankInt
{

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