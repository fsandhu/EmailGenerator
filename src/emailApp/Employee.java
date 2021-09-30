package emailApp;

import java.util.Scanner;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String department;
	private String company = "company";
	
	public Employee(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		setDepartment();
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment() {
		
		System.out.print("DEPARTMENT CODES"
				+ " \n1 for Sales\n2 for Development\n3 for Accounting\n"
				+ "0 for none\nEnter your dept: ");
		
		Scanner s = new Scanner(System.in);
		int dept = s.nextInt();
		if (dept == 1) {
			this.department = "sales";
		} else if (dept == 2) {
			this.department = "dev";
		} else if (dept == 3) {
			this.department = "acct";
		} else {
			this.department = "";
		}

	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
