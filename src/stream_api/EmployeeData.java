package stream_api;

import java.util.Objects;

public class EmployeeData {

	private String name;
	private String department;
	private double salary;
	private int score;

	public EmployeeData() {}

	public EmployeeData(String name, String department, double salary, int score) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, name, salary, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeData other = (EmployeeData) obj;
		return Objects.equals(department, other.department) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& score == other.score;
	}

	@Override
	public String toString() {
		return "EmployeeData [name=" + name + ", department=" + department + ", salary=" + salary + ", score=" + score
				+ "]";
	}
}