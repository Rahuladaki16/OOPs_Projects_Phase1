package com.simplilearn.projects;

import java.util.Scanner;
public class EmailValidation {
	public static void main(String[] args) {
		Boolean flag=false;
		String emails[]=new String[5];
		emails[0]="rahuladaki11@gmail.com";
		emails[1]="adakirahul11@gmail.com";
		emails[2]="rdadaki11@gmail.com";
		emails[3]="rahulda11@gmail.com";
		emails[4]="rahuldadaki11@gmail.com";
		
		Scanner sc=new Scanner(System.in);
		int option;
		
		while(true)
		{
			flag=false;
			System.out.println("Enter the Email Id:");
			String userEmail=sc.next();
			
			for(String email:emails)
			{
				if(userEmail.matches(email))
				{
					System.out.println("Welcome :"+userEmail);
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("Invalid User");
			}
			System.out.println("Do you want to continue: 1.Yes or 2.No :");
			option=sc.nextInt();
			if(option==2)
			{
				System.out.println("Exit");
				break;
			}
		}
	}

}
