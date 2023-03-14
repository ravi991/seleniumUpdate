package seleniumPackage;

public class ObjectCreation {

//	ObjectCreation(String username,String password)
//	{
//		System.out.println("This is a constructor "+username+ " "+ password);
//	}
//	
	int add()
	{
		int a =10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}
	
	public static void main(String[] args) {
		// Create object 
		ObjectCreation obj=new ObjectCreation();
		obj.add();
	}

}
