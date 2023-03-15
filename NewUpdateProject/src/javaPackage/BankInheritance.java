package javaPackage;

public class BankInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj= new Bank();
		obj.bankName();
		obj.bankProcess();
	}

}


class BankSystem
{
	void bankProcess()
	{
		System.out.println("Define the bank process");
	}
	void transcationId()
	{
		System.out.println("Bank System TranscationId");
	}
	
}



class Bank extends BankSystem
{
	
	void bankName()
	{
		System.out.println("Bank of America");	
	}
	
	void transcationId()
	{
		System.out.println("Bank of America TranscationId");
	}
}