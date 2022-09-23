package javaPackage;

public class ObjectProgram {
	void runCode()
	{
		System.out.println("Run Code ");
	}
	
	int execute()
	{
		
		return 2;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectProgram obj= new ObjectProgram();
		
		obj.runCode();
		System.out.println(obj.execute());
	}

}
