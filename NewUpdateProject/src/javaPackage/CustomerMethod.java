package javaPackage;

public class CustomerMethod {
	String name;
	String sex;
	String address;
	int fee;
	
	CustomerMethod(String name,String sex,String address,int fee)
	{
		this.name=name;
		this.sex=sex;
		this.address=address;
		this.fee=fee;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerMethod customer1 = new CustomerMethod("Harry","male","Virgania",4000);
		System.out.println(customer1.name);
		System.out.println(customer1.sex);
		System.out.println(customer1.address);
		System.out.println(customer1.fee);
	}

}
