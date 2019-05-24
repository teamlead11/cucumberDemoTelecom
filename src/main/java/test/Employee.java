package test;

public class Employee {

	private String empName;
	private int empId;
	private int salary;
	private int experience;

	
	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
		
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public int calculateBonus(int salary, int experience) {
		int bonus = salary * experience / 100;
		
		return bonus;
	}
}
