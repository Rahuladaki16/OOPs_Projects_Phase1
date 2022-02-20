package com.simplilearn.projects;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int num1,num2,sol,ch;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the two numbers:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			System.out.println("Choose the operation you would like to perform:-(1/2/3/4/5):");
			System.out.println("1.Addition(+)");
			System.out.println("2.Subtraction(-)");
			System.out.println("3.Multiplication(*)");
			System.out.println("4.Division(/)");
			System.out.println("5.Modulus(%)");
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			if(ch==1)
			{
				sol=num1+num2;
				System.out.println("Addition of two numbers:"+sol);
			}
			else if(ch==2)
			{
				sol=num1-num2;
				System.out.println("Subtraction of two numbers:"+sol);
			}
			else if(ch==3)
			{
				sol=num1*num2;
				System.out.println("Multiplication of two numbers:"+sol);
			}
			else if(ch==4)
			{
				sol=num1/num2;
				System.out.println("Division of two numbers:"+sol);
			}
			else if(ch==5)
			{
				sol=num1%num2;
				System.out.println("Modulus of two numbers:"+sol);
			}
			System.out.println("would you like to continue to use?(1.Yes or 2.No):");
			int cnt=sc.nextInt();
			if(cnt==2)
			{
				break;
			}
		}
		
	}

}
