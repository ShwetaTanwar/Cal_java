package javafirst;
import java.util.Scanner;
public class Array 

{
	
	public   static void main(String[]args)
	{
		int size;
	
		String a[]=new String[20];
		System.out.println("enter how many strings you want enter");
		Scanner sc=new Scanner ( System.in);
	
		size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("enter strings");
			a[i]=sc.next();
		}
		
	System.out.println("entered strings are\n");
	for(int i=0;i<size;i++)
		System.out.println(a[i]);
		
	}}

	

