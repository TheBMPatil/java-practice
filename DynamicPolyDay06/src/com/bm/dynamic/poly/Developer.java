package com.bm.dynamic.poly;

public class Developer extends Employee {
	String skillSet;
	double bonous;

//	public Developer(int id, String name, double sal, String skills) {
//		super(name, sal, id);
//		skillSet = skills;
//	}

	public Developer() {
		super();
	}

	public Developer(String name, double salary, int empId, String skillSet, double bonous) {
		super(name, salary, empId);
		this.skillSet = skillSet;
		this.bonous = bonous;

	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public void attendance() {
		System.out.println("Attendance Develoer");
	}

	public String attendance(String msg) {
		return msg;
	}

	public double calSal() {

//		System.out.println("Developer salaray :");
		return salary + bonous;
	}

}
