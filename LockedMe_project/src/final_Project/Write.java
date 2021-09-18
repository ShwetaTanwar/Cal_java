package final_Project;
import java.io.*; 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.Writer;

public class Write {
	
	public  void writeFile() throws Exception {
             Scanner sc=new Scanner(System.in);
             
             
             System.out.println("Do you want to see list of files press yes or no ");
    		 String c=sc.next();
    		 
    		 if(c.equalsIgnoreCase("yes")) {
    		  Dir_File call=new Dir_File();
    		   call.file_list();}
    		 
    		 else if(c.equalsIgnoreCase("no"))
    		 { System.out.println("You choose not to show file names");
    			  }
    		 else {
    			 System.out.println("Wrong Choice");
    		 }
    		 
             
             
			System.out.println("Now Enter file name to Write Data ");
		    String FileName= sc.next();
		    String Add="D:/File_Store/";
		    String ext=".txt";
		    String loc=Add+FileName+ext;
		    
	
	        	  File myFile = new File(loc);
	                    if (!myFile.exists()) { 
	            	 	myFile.createNewFile();
	            	 	System.out.println("Newly File Created");
	                    }
	            
	                   else {
	                 	System.out.println("File already exist ");
	                    }
	             
	          //  System.out.println("do you want to Write in file press yes or no ");
	   		 //String ch=sc.next();
	   		 
	   		// if(ch.equalsIgnoreCase("yes")) {
	   			 
	   			 System.out.println("Enter String \n Press 'Enter + tab' key to End The String ");
	   			
	 		    String text=null;
	 		    sc.useDelimiter("\\t");
	 		       while(true)
	 		          {
	 		    	text=sc.next();
	 		    	break;
	 		        }
	 		   

	            BufferedWriter bufferedWriter = null;
	            Writer writer = new FileWriter(myFile);
	            bufferedWriter = new BufferedWriter(writer);
	            bufferedWriter.write(text);
	            System.out.println("You Written in File " + FileName + ext);
	            bufferedWriter.close();}
}
	   		
	   		  
	   			 
	   			 
	   		 
	   		


		    
		   
	       
	            
	        
	    
