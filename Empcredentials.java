package com.greatlearning.service;

import com.greatlearning.Model.Employee;

public interface Empcredentials {
	String generateEmailId (String fname, String lname, String dept);
	String generatepassword();
	void showDetails (Employee e);

}
