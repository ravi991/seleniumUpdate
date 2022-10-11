package javaPackage;

public class InheritClass {
	
	void acctBalance()
	{
		System.out.println("this is my current balance $1000");
	}
	
	void  acctBalance(int a)
	{
		System.out.println("The new balance is $"+a );
	}

	public static void main(String[] args) {
		// method overriding 
		BankCust obj = new BankCust();
		obj.custDetails();
		obj.bankName();
		
		obj.bankId();
		
		// method overloading 
		InheritClass obj1= new InheritClass();
		obj1.acctBalance();
		obj1.acctBalance(2000);
	}
	
}


class BankNew 
{
	void bankName()
	{
		System.out.println("The name of bank is BOA");
	}
	
	  void bankId()
	{
		System.out.println("The bankId is 10001");
	}
}


class BankCust extends BankNew
{
	void custDetails()
	{
		System.out.println("The details of customer ");
	}
	
	void bankId()
	{
		System.out.println("The bankId of Customer is 10034");
	}
	
	
}