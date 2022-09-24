package javaPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileNotFoundExceptionClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
	        // Opening the file
	          File f=new File("file.txt");   
	            
	          // creating printWriter object
	          // by initiating fileWriter 
	        PrintWriter p1=new PrintWriter(new FileWriter(f), true);
	            
	          // printing sample text
	        p1.println("Hello world");
	          p1.close();
	        
	          // changing the file operation 
	          // to read-only 
	        f.setReadOnly();
	        
	          // trying to write to new file
	          PrintWriter p2=new PrintWriter(new FileWriter("fileData.txt"), true);
	        p2.println("Hello World");
	    }
	      
	    // catching exception thrown
	    // by try block
	    catch(FileNotFoundException ex) {
	       System.out.println("File Not Found "+ex.getMessage());
	    }
	}

}
