package javaPackage;



public class Customer {

	String name;
	String sex;
	String address;
	int fee;
	public static void main(String[] args) {
		// Create a object 
		Customer obj = new Customer();
		obj.name ="Harry";
		obj.sex="Male";
		obj.address ="7423 Cold Harbor Road";
		obj.fee = 990;
		
		System.out.println("Name of the Customer "+obj.name);
		System.out.println("Sex of the Customer "+obj.sex);
		System.out.println("Address of the Customer "+obj.address);
		System.out.println("Fee of the Customer "+obj.fee);
		
		Customer obj1= new Customer();
		obj1.name ="John";
		obj1.sex="Male";
		obj1.address ="6283 Battefield Park Road";
		obj1.fee = 990;
		
		System.out.println("Name of the Customer "+obj1.name);
		System.out.println("Sex of the Customer "+obj1.sex);
		System.out.println("Address of the Customer "+obj1.address);
		System.out.println("Fee of the Customer "+obj1.fee);
	}

}
