
public class Outer_class {

		
		private String msg =" i am outer class";
		 
		 class Inner{
			 
			 void hi() 
			 {
				 System.out.println(msg);
			 }
			          }

	public static void main()
	{
		Outer_class n= new Outer_class();
	 Outer_class.Inner num= n.new Inner();
		num.hi();
	}
	}
