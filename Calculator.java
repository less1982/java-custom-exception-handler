package net.codejava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) throws CustomValidationException, InvalidOperationException {
		Scanner calculator = new Scanner(System.in);
		System.out.println("Red River College");
		System.out.println("Custom Calculator");
		System.out.println(" ");
		
		//Questions
		System.out.print("Enter first value: ");
		int f = calculator.nextInt();
		System.out.print("Enter second value: ");
		int s= calculator.nextInt();
		System.out.print("Enter operation (a=Add, s=Subtract, m=Multiply): ");
		char o = calculator.next() .charAt(0);
	
	
		//print 
		if (f<0 || s<0) {
			throw new CustomValidationException("Integer must be greater than zero. Please re-enter.");
			}
			if (o=='a')
				{
				System.out.println("The total is $" + (f + s));
				}
			else if (o=='s')
				{
					System.out.println("The total is $" + (f - s));
				}
			else if (o=='m')
				{
					System.out.println("The total is $" + (f * s));
				}
			else 
				{
				throw new InvalidOperationException("Operation is invalid. Please re-enter.");
				}
			}
}