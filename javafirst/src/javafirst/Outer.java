package javafirst;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Outer {
	 public static void main(String[] args) throws IOException{
 	    try {
 	    	
 	    	
 	    	Scanner sc=new Scanner(System.in);
			System.out.println("Enter file name to Write Data");
		    String FileName=sc.next();
		    String Add="D:/File_Store/";
		    String ext=".txt";
		    String loc=Add+FileName+ext;
		    
			//File file = new File(loc);
 	      FileWriter myWriter = new FileWriter(loc);
 	      System.out.println("Enter content to Write in File");
 	      
 	     System.out.println("enter string");
 		
		    String text=null;
		     text=sc.nextLine();
		                //reads string  
	 	    System.out.println("You have entered: "+text);  
 	     
 	         myWriter.write(text);
 	      myWriter.close();
 	      System.out.println("Successfully wrote to the file.");
 	    } catch (IOException e) {
 	      System.out.println("An error occurred.");
 	      e.printStackTrace();}}

}

	 
	 
