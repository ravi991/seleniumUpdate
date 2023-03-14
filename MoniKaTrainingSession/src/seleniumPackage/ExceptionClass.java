package seleniumPackage;

public class ExceptionClass {

	public static void main(String[] args) throws ArithmeticException{
//TODO Auto-generated method stub
		try
		{
			int i =1/0;
		}
		
		catch(Exception e)
		{
			System.out.println("Can't be divisible ");
		}
	}

}
