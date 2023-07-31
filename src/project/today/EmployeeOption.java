package project.today;

import java.util.InputMismatchException;
import java.util.Scanner;
public class EmployeeOption extends EmployeeInfo{
	public void main() {
		try {	
			
			Scanner s = new Scanner(System.in);
			EmployeeInfo e1 = new EmployeeInfo();
			
			System.out.println("1.View 2.Add 3.Delete 4.Update ");
			System.out.println("Enter your choice: ");
			section = s.nextInt();
			do {
				switch(section)
				{
				case 1: System.out.println("\n");
				e1.EmployeeInfo();
				this.main();
				break;
				
				case 2: System.out.println("\n");
				EmpAdd a1 = new EmpAdd();
				e1.EmployeeInfo();
				a1.EmployeeAdd();
				this.main();
				break;
				
				case 3: System.out.println("\n");
				EmpDelete d1 = new EmpDelete();
				e1.EmployeeInfo();
				d1.EmployeeDelete();
				this.main();
				break;
				
				case 4: System.out.println("\n");
				EmpUpdate u1 = new EmpUpdate();
				e1.EmployeeInfo();
				u1.EmployeeUpdate();
				this.main();
				break;
				
				case 5: System.out.println("Invalid Input!!");
				this.main();
				System.out.println("Enter your choice: ");
				default:
				}
				
			} while(section!=4);
			
		
		}
		catch (InputMismatchException err) {		
		System.out.print("Invalid Input");
		}
	}
		}



