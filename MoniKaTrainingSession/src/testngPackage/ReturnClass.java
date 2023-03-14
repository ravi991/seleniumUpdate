package testngPackage;

public class ReturnClass {

	int add()
	{
		int a =10;
		int b =20;
		int sum =a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnClass obj= new ReturnClass();
		System.out.println(obj.add());
	}

	
}
