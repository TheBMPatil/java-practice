package com.bm.code.external;

import com.bm.code.security.Employee;

public class SalesPerson extends Employee{

	public SalesPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		System.out.println("Sales pay Salary");
		return 0;
	}

	@Override
	public void confidentialMethod() {
		// TODO Auto-generated method stub
//		super.confidentialMethod();

		System.out.println("I am hacker...I have got your money..!");

	}

}
