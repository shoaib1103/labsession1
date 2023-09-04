package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.Model.Employee;

public class EmpcredentialsImpl implements Empcredentials {
	
	@Override
	public String generateEmailId(String fname, String lname, String dept) {
		return fname+lname+"@"+dept+".gl.com";
	}
		

	@Override
	public String generatepassword() {
		String caps= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower= "abcdefghijklmnopqrstuvwxyz";
		String nums= "123456789";
		String splchars= "!@#%&*()";
		
		String combined=caps+lower+nums+splchars;
		String pass= "";
		Random random = new Random();
		for (int i=0;i<7;i++)
		{
		pass=pass+String.valueOf(combined.charAt(random.nextInt(combined.length()))); 
		}
		return pass;
	}
	public void showDetails(Employee e) {
		System.out.println("Employee Firstname is "+e.getFname());
		System.out.println("Employee Lastname is "+e.getLname());
		System.out.println("Employee Email is "+e.getEmailid());
		System.out.println("Employee Password is "+e.getPassword());
	}
	
}	
		
		
	
