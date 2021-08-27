package javafirst;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		double num1 , num2,ans;
		char choice;
		Scanner a = new Scanner (System.in);
		System.out.println("enter both numbers\n");
		num1= a.nextDouble();
		num2=a.nextDouble();
		System.out.println("Enter '*' for  multipication ");
		System.out.println("Enter '+' for addition");
		System.out.println("Enter '-' for subtraction");
		System.out.println("Enter '/' for dividation");
		choice=a.next(). charAt(0);
		double answer=0;
		switch(choice) {
		case '*':
			answer=num1*num2;
			break;
		case '+':
			answer=num1+num2;
			break;
		case '-':
			answer=num1-num2;
			break;
		case '/':
			if (num1 ==0 || num2== 0 ){
				System.out.println("0 can't be input for dividation\n");
			return;	}
			answer=num1/num2;
			break;
		default:
			System.out.println("Input correct operation");
	       return;
		}
		
		System.out.println("result is:\n" + answer);
	}}
			
		
	
