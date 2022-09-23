package javaPackage;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i =1/0;
			System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println("Can't divide by zero");
		}
	}

}
