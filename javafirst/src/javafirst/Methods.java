package javafirst;

import java.util.Scanner;

public class Methods {
	
	public void print ()
	
	{ System.out.println("hello there");}
	
	public int cube(int c)
	{
		int an= c*c*c;
		return an;
	}
public static void main(String[]arg)
	{
	Methods m=new  	Methods();
	m.print();
	int sc;
	System.out.println("enter value to do cube");
	Scanner scan= new Scanner (System.in);
	sc=scan.nextInt();
	int ans= m.cube(sc);
	System.out.println("cube : "+ans);
	}
	
	}
 



