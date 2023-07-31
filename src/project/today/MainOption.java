package project.today;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MainOption extends StuInfo {
	
	public void main() {
	try {	
		
		Scanner s = new Scanner(System.in);
		StuInfo s1 = new StuInfo();
		
		System.out.println("1.View 2.Add 3.Delete 4.Update ");
		System.out.println("Enter your choice: ");
		option = s.nextInt();
		do {
			switch(option)
			{
			case 1: //System.out.println("\n");
			s1.StudentInfo();
			this.main();
			break;
			
			case 2: //System.out.println("\n");
			StuAdd a1 = new StuAdd();
			s1.StudentInfo();
			a1.StudentAdd();
			this.main();
			break;
			
			case 3: //System.out.println("\n");
			StuDelete d1 = new StuDelete();
			s1.StudentInfo();
			d1.StudentDelete();
			this.main();
			break;
			
			case 4:// System.out.println("\n");
			StuUpdate u1 = new StuUpdate();
			s1.StudentInfo();
			u1.StudentUpdate();
			this.main();
			break;
			
			case 5: System.out.println("Invalid Input!!");
			this.main();
			System.out.println("Enter your choice: ");
			default:
			}
			
		} while(option!=6);
		
	
	}
	catch (InputMismatchException err) {		
	System.out.print("Invalid Input");
	}
}
	}

