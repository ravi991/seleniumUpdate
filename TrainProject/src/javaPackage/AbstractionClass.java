package javaPackage;

public class AbstractionClass extends EmployeeDetails{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionClass obj= new AbstractionClass();
		obj.empolyeeNumber();
	}

	@Override
	void empolyeeNumber() {
		
		System.out.println("The employee id number is 110000 ");
	}

}


abstract class EmployeeDetails 
{
	
abstract void empolyeeNumber();

void employeeDesigination()
{
	System.out.println("The employee designation is Tester ");
}
}