package javafirst;
import java.util.Scanner;

public class E_mail {
	public static void main(String[]args) {
		
		
	String[] str=new String[] { 
			
			
            "amcilwraith1@shinystat.com",
			"dcarsberg2@yandex.ru",
			"hbrindle3@ebay.co.uk",
			"rtreby4@amazonaws.com",
			"aforth5@statcounter.com",
			"aguiraud6@storify.com",
			"jtrowler7@desdev.cn",
			"gfagge8@live.com",
			"ndrewett9@dyndns.org"
};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter e-mail id to check whether it's avilable or not");
	String find= sc.next();
	int count=0;
	for(int i=0;i<str.length;i++)
	{
		if (str[i].equals (find))
		{ 
			count++;
		
			System.out.println("e-mail found in record");
			break;
		}}
		if(count==0)
		System.out.println("e-mail not found");
	}}
