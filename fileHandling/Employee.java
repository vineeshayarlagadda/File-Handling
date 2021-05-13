package fileHandling;

public class Employee {
	int id;
	String name;
	String dept;
	int salary;
	
	
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}


	public Employee() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee name : "+name+", Employee ID : "+id+", Employee department : "+dept+", Employee Salary : "+salary;
	}

}
