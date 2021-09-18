package final_Project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;


	public class Function {
		   
		public static void createFile() throws Exception {
			Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter file name to create");
		    String FileName=sc.next();
		    String Add="D:/File_Store/";
		    String ext=".txt";
		    String loc=Add+FileName+ext;
			File file = new File(loc);
		       
		     if(file.createNewFile())
			{  System.out.println("Newly File Created ");}
			 
		    	else 
			   {System.out.println("File Alrady exist");}
		    	
		    	System.out.println("Do You want to write in the File \n\n\t\t\t press yes or no ");
		    	String cho=sc.next();
			     if (cho.equalsIgnoreCase("yes"))
			     { 
				 System.out.println("Enter String \n Press 'Enter + tab' key to End The String ");
		   			
		 		    String text=null;
		 		    sc.useDelimiter("\\t");
		 		       while(true)
		 		          {
		 		    	text=sc.next();
		 		    	break;
		 		        }
		 		   

		            BufferedWriter bufferedWriter = null;
		            Writer writer = new FileWriter(file);
		            bufferedWriter = new BufferedWriter(writer);
		            bufferedWriter.write(text);
		            System.out.println("You Written in File " + FileName + ext);
		            bufferedWriter.close();
			      
			     }
			     else if(cho.equalsIgnoreCase("no"))
			     {
			    	 System.out.println("You choose not to write in file");
			     }
			     else
			     {
			    	 System.out.println("Wrong input ");
			    	 
			     }
		
		
			}
		 public static void readFile () throws Exception
		    {
			 Scanner sc=new Scanner(System.in);
			 
			 System.out.println("\nDo you want to see list of files For Read Operation \n\n\t\t\t press yes or no ");
			 String ch=sc.next();
			 
			 if(ch.equalsIgnoreCase("yes")) {
			  Dir_File call=new Dir_File();
			   call.file_list();}
			 
			 else if(ch.equalsIgnoreCase("no"))
			 { System.out.println("You choose not to show exist file names");
				  }
			 
			 else
			 {
				 System.out.println("Wrong choice");
			 }
			 
			 
			
			 System.out.println("\nEnter file name to Read content");
			 
			    String FileName= sc.next();
			    String Add="D:/File_Store/";
			    String ext=".txt";
			    String loc=Add+FileName+ext;
				File file = new File(loc);
			       
		        int choice=0;
		        FileReader fr=null;
		      try
		        {fr = new FileReader(loc);}
		        catch (FileNotFoundException fe)
		        { System.out.println("File not found");}
		        while ((choice=fr.read())!=-1)
		            System.out.print((char)choice);
		        fr.close(); }
		 

	}
	
