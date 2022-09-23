package javaPackage;

public class CustomerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateCustomer obj= new CreateCustomer();
		obj.setName("Harry");
		obj.setSex("Male");
		obj.setAddress("Virgania");
		obj.setAmount(2000);
		
		System.out.println("The name of customer "+obj.getName());
		System.out.println("The sex of customer "+obj.getSex());
		System.out.println("The address of customer "+obj.getAddress());
		System.out.println("The amount of customer $"+obj.getAmount());
	}

}


class CreateCustomer 
{
	private String name; 
	private String sex;
	private String address;
	private int amount;
	
	public void setName(String name)
	{
		this.name=name;
	
	}
	
	public void setSex(String sex)
	{
		this.sex=sex;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public void setAmount(int amount)
	{
		this.amount=amount;
	}
	public String getName()
	{
		return name;
	}
	
	public String getSex()
	{
		return sex;
	}
	public String getAddress()
	{
		return address;
	}
	public int getAmount()
	{
		return amount;
	}
}