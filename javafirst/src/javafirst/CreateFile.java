package javafirst;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	   
	public static void createFile() throws IOException {
	    	
		File file = new File("/home/shwetatanwar980/File_Folder/welcome.txt");
	       
	     if(file.createNewFile())
		{  System.out.println("File Created");}
		else
		{System.out.println("File Already exist");}}
	
	    public static void readFile () throws IOException
	    {
	        int ch=0;
	        FileReader fr=null;
	      try
	        {fr = new FileReader("/home/shwetatanwar980/File_Folder/welcome.txt");}
	        catch (FileNotFoundException fe)
	        { System.out.println("File not found");}
	        while ((ch=fr.read())!=-1)
	            System.out.print((char)ch);
	        fr.close(); }
	    
	  public static void writeFile() throws IOException{
	    	    try {
	    	      FileWriter myWriter = new FileWriter("/home/shwetatanwar980/File_Folder/welcome.txt");
	    	      myWriter.write("Welcome in Java Files!\n");
	    	      myWriter.close();
	    	      System.out.println("Successfully wrote to the file.");
	    	    } catch (IOException e) {
	    	      System.out.println("An error occurred.");
	    	      e.printStackTrace();}}
	    	  
	    	  public static void appendFile() throws IOException
	    	  {
	    		  File fn=new File("/home/shwetatanwar980/File_Folder/welcome.txt");
	    			FileWriter fileWriter= new FileWriter(fn,true);
	    			BufferedWriter buffer= new BufferedWriter(fileWriter);
	    			PrintWriter printWriter=new PrintWriter(buffer);
	    			
	    			if(fn.exists()==false)
	    			{fn.createNewFile();
	    				System.out.println("The File is created ");}
	                printWriter.println("New line using append Command");
	    			System.out.println("Data Appended");
	    			printWriter.close();
	    			}
	    				
	public static void main(String[]args) throws Exception {
	System.out.println("Enter 1 for Create a New File \n Enter 2 For Reading Data From File");
			System.out.println("Enter 3 For Writing Data In a File \n Enter 4 for Append Data  in a File\n Enter 5 For Exit ");
			Scanner sc= new Scanner (System.in);
	char choice;
	choice=sc.next(). charAt(0);;
	switch(choice)
	{
	case '1':createFile();	break;
	case '2':readFile(); break;
	case '3' :writeFile();break;
	case '4' :appendFile();break;
	case '5' : System.out.println("You choose to exit"); break;
	default: System.out.println("Wrong Input");

}
}}
