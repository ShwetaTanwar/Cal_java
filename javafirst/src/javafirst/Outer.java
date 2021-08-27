package javafirst;

public class Outer {

	private String msg =" i am outer class";
	 
	 class Inner{
		 
		 void hi() 
		 {
			 System.out.println(msg);
		 }
		          }

public static void main(String[]args)
{
	Outer n= new Outer();
 Outer.Inner num= n.new Inner();
	num.hi();
}
}



