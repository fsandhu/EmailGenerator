package emailApp;

import java.util.Scanner;

public class Email {

	private Employee employee;
	@SuppressWarnings("unused")
	private String password;
	private String email;
	@SuppressWarnings("unused")
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	@SuppressWarnings("unused")
	private String alternateEmail;
	
	
	//Constructor
	public Email(Employee e){
		
		this.password = RandomPassGenerator.randomPass(defaultPasswordLength);
		
		if (e.getDepartment() == "") {
			
			this.email = e.getFirstName().toLowerCase() + "." + e.getLastName().toLowerCase() + "@"
					 + e.getCompany() + ".com";
			
		} else {
			
		this.email = e.getFirstName().toLowerCase() + "." + e.getLastName().toLowerCase() + "@"
				+ e.getDepartment() + "." + e.getCompany() + ".com";
		
		}
		
		this.showInfo();
	}
	
	// accessible to other classes within same package
	void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Your email is " + this.email);
		System.out.println("Your password is " + this.password);
	}
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	} 
	
	public void setAltEmail(String email) {
		this.alternateEmail = email; 
	}
	
	public void changePassword(String password) {
		this.password = password;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
