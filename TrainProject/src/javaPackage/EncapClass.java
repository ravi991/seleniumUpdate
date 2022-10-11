package javaPackage;

public class EncapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details obj = new Details();
		obj.setter(200);
		
		System.out.println(obj.getter());
	}

}


class Details
{

	private int id;
	
	void setter(int a )
	{
		id=a;
	}
	
	int getter()
	{
		return id;
	}
}