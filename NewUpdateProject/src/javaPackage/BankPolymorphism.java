package javaPackage;

public class BankPolymorphism {
	void balance()
	{
		int deposit =2000;
		System.out.println("The current deposit in account "+deposit);
	}
	
	void balance(int deposit)
	{
		int currentBalance = 2000-deposit;
		System.out.println("The minimum amount balance"+currentBalance);
	}
	void balance(int firstAmount, int secondAmount)
	{
		int currentBalance =firstAmount+secondAmount;
		System.out.println("The update amount balance "+currentBalance);
	}
	
	public static void main(String[] args) {
		
		//method overriding  --- compile time 
				Bank obj= new Bank();
				obj.transcationId();
				
				// method overloading -- runtime 
				BankPolymorphism obj1= new BankPolymorphism();
				obj1.balance();
				obj1.balance(1000);
				obj1.balance(1000, 2000);
	}

}

