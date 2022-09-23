package javaPackage;

public class InheritanceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College obj =new College ();
		obj.registerCollege();
		obj.registerUniversity();
	}

}


class University 
{
	  void registerUniversity()
	{
		System.out.println("This is the university class");
	}
}

class College extends University
{
	void registerCollege()
	{
		System.out.println("This is college class");
	}
}

