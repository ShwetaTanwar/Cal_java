package final_Project;

import java.util.Scanner;

public class Lock_Main extends Function{
	 
	public  void submenu() throws Exception {
		Lock_Main obj = new  Lock_Main();
		System.out.println("\nEnter '1' For Create a File\nEnter '2' For Delete a File\nEnter '3' For Write in a File"); 
        System.out.println("Enter '4' For Read in a File\nEnter '5' For Previous Option\nEnter '6' For Exit");
        Scanner sc1= new Scanner (System.in);
       char  choice1=sc1.next(). charAt(0);
        switch(choice1)
        {
         case '1':
        createFile();	
    	obj.ask_Again();    break;
        case '2':
      	  Delete delete= new Delete();
	            delete.delete_File();
	            obj.ask_Again(); 
	        	break;
        case '3':
      	  Write write= new Write();
	            write.writeFile();
	            obj.ask_Again();
	            break;
        case '4' :
	        readFile();
	        obj.ask_Again();
	        break;
	       
        case '5':  
        	obj.mainMenu();
      	    break;
      case '6':  
                 System.exit(0);
      default: System.out.println("Wrong Input inner");break;
        }
		
	}
	
	public static void main(String[]args) throws Exception {
		
		
		String message = "\n\n\n\n\n\n\t\t\t\t\t\t************************* Welcome To Lockedme.com***************************\n\n\n\t\t\t\t\t\t\t\t This Application is Developed By Shweta Tanwar";
        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            System.out.print(chars[i]);
            Thread.sleep(60);
        }
        
     
        Lock_Main obj = new  Lock_Main();
		obj.mainMenu();
	}
	
		
		public  void mainMenu() throws Exception 
		{
			Lock_Main obj = new  Lock_Main();
	
			
			System.out.println("\nSelect any Options --- And press Enter");
			System.out.println("\nEnter '1' For Show all Files From Folder \nEnter '2' Menu For File Operation \nEnter '3' Exit");
					
			Scanner sc= new Scanner (System.in);
		       char  choice=sc.next(). charAt(0);
		        switch(choice)
		        {
		case '1': Dir_File call=new Dir_File();
	             call.file_list();
	             obj.ask_Again();break;
		case '2': obj.submenu(); break;
		case '3' :  System.exit(0);
		default: System.out.println("Wrong Input");
		          obj.ask_Again();
		        }
		}
	
		
		public  void ask_Again() throws Exception 
		{  Lock_Main obj = new  Lock_Main();
			Scanner sc2= new Scanner (System.in);
			System.out.println("\n\n\tDo you want to go Back in Previous Menu Press 'Yes or no' ");
            String c=sc2.next();
   		 
   		 if(c.equalsIgnoreCase("yes")) {
   		      obj.mainMenu();
   		      }
   		  else if(c.equalsIgnoreCase("no"))
   		       {   System.exit(0);
   			  }
   		 else {
   			 System.out.println("Wrong Choice");
   		      }
}	   }


