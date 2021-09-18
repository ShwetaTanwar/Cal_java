package final_Project;

import java.io.File;
import java.util.Scanner;

public class Delete {
	
	 public static void delete_File() throws Exception{ 
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("\ndo you want to see list of files press yes or no ");
		 String ch=sc.next();
		 
		 if(ch.equalsIgnoreCase("yes")) {
		  Dir_File call=new Dir_File();
		   call.file_list();}
		 
		 else if(ch.equalsIgnoreCase("no"))
		 { System.out.println("You choose not to show file names");
			  }
		 else {
			 System.out.println("Wrong Choice");
		 }
		 
		 
		   String Add="D:/File_Store/";
		    String ext=".txt";
		   System.out.println("\nNow Enter file name to Delete");
		    String FileName=sc.next();
		    String loc=Add+FileName+ext;
		   
			File file = new File(loc);
		     
		    if (file.delete()) { 
		      System.out.println("Deleted the file: " + file.getName());
		    } else {
		      System.out.println("File not Found to delete: "+ file.getName() );
		    } 
		  } 
	 }

