package javaPackage;

public class CustomerBankDetails {
	private String name;
    private double balance;
    
    public CustomerBankDetails(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        balance = balance+amount;
    }
    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance =balance - amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    public void printBalance() {
        System.out.println("Account balance for " + name + " is " + balance);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerBankDetails obj= new CustomerBankDetails("John",1000.0);
		obj.deposit(500.0);
		obj.printBalance(); // prints "Account balance for John  is 1500.0"
        
		obj.withdraw(2000.0); // prints "Insufficient funds"
        
		obj.withdraw(500.0);
		obj.printBalance(); // prints "Account balance for John  is 1000.0"
	}

}
