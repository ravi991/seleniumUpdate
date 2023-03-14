package javaPackage;

public class BankSystem {
	void currentBalance()
	{
		System.out.println("The cuurent balance is $10000");
	}
	
	void currentBalance(int a)
	{
		int updateBalance= 10000-a;
		System.out.println("The current balance is $"+updateBalance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOA obj = new BOA();
		obj.updateAccount();
		obj.createAccount();
		// method overriding 
		obj.bankDetails();
		
		// method overloading
		BankSystem obj1= new BankSystem();
		obj1.currentBalance();
		obj1.currentBalance(1000);

	}

}


class Bank
{
	
	void createAccount()
	{
		System.out.println("Create a account in Bank");
	}
	void bankDetails()
	{
		System.out.println("Provide the bank details");
	}
}


class BOA extends Bank
{
	protected void updateAccount()
	{
		System.out.println("The account is created in BOA");
	}
	
	void bankDetails()
	{
		System.out.println("The details of BOA bank");
	}
}
