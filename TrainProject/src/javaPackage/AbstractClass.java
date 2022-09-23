package javaPackage;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonRecord obj= new PersonRecord();
		
		obj.personDetails();
		obj.courseDetails();
		
	
	}

}

abstract class Person 
{
	String name= "Harry";
	String sex ="female";
	String address= "Virgania";
	int fee = 2000;
	String courseName= "QAAutomation";
	abstract void personDetails();
	
	public void courseDetails()
	{
		System.out.println("The course Selected");
	}
}

class PersonRecord extends Person
{
	
	@Override
	void personDetails() {
		// TODO Auto-generated method stub
		System.out.println("The name of the person "+name);
		System.out.println("The sex of the person "+sex);
		System.out.println("The address of the person "+address);
		System.out.println("The fee of candidate $"+fee);
	}
	
	public void courseDetails()
	{
		System.out.println("The Course Selected "+courseName);
	}
	
}