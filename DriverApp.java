package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.Model.Employee;
import com.greatlearning.service.EmpcredentialsImpl;

public class DriverApp {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("please enter Employee First name");
		 String f=sc.next();
		 System.out.println("please enter Employee Last name");
		 String l=sc.next();
		 
		 Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp2.setFname("Shoaib");
		emp2.setLname("rafiq");
		
		
		 EmpcredentialsImpl cred=new EmpcredentialsImpl();
		
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		
		System.out.println("Please choose your department");
		int choice=sc.nextInt();
		String genEmail="";
		String genPassword="";
		switch(choice)
		{
//case 1:
			//genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "Tech");
			//break;
case 2:
			genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "Admin");
			break;
case 3:
			genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "Hr");
			break;
case 4:
			genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "Legal");
			break;
default : 	System.out.println("Please enter valid Input");
          
		}
		genPassword=cred.generatepassword();
		emp1.setEmailid(genEmail); //shoaib.rafiq@tech.gl.com
		emp1.setPassword(genPassword); //A12$dfe3s
		
		cred.showDetails(emp1);//fname,lname,id & pw
	}

}
