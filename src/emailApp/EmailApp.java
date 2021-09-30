package emailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee fateh = new Employee("Fateh",  "Sandhu");
		fateh.setCompany("microsoft");
		Email em1 = new Email(fateh);
		Scanner s = new Scanner(System.in);
		System.out.print("If you want to change password, input 1:	");
		int input = s.nextInt();
		if (input == 1) {
			System.out.print("Enter new password: ");
			String newPass = s.next();
			s.close();
			em1.changePassword(newPass);
			em1.showInfo();
		} else {
			s.close();
		}
	}

}
