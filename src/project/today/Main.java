package project.today;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final  String STUDENT="1.Student Information"; //final keyword
		final  String TEACHER="2.Teacher Information";//final keyword
		final  String EMPLOYEE="3.Employee  Information";//final keyword
		final  String HELP="4.Help Center";//final keyword
		Scanner scan = new Scanner(System.in);
		System.out.println(STUDENT);
		System.out.println(TEACHER);
		System.out.println(EMPLOYEE);
		System.out.println(HELP);
		System.out.println("Enter your choice: ");
		
		int choice;
		choice = scan.nextInt();
		switch(choice) {
		case 1:
			//System.out.println("\n");
			StudentInfo();
			break;
		case 2:
			//System.out.println("\n");
			TeacherInfo();
			break;
		case 3:
			//System.out.println("\n");
			EmployeeInfo();
			break;
		case 4:
			//System.out.println("\n");
			HelpCenter();
			break;
		}
	}

	static void StudentInfo() {
		StuInfo s1 = new StuInfo ();
		s1.display();
				
	}
	static void TeacherInfo() {
		TeacherInfo t1 = new TeacherInfo();
		t1.display();
		
	}
	static void EmployeeInfo() {
		EmployeeInfo e1 = new EmployeeInfo ();
		e1.display();
		
	}
	static void HelpCenter() {
		HelpCenter h1 = new HelpCenter();
		h1.displayHelpCenter();
//		describeHelpCenter("Admin@gmail.com",01567);
//		h1.displayHelpCenter();
//		
	}

}



