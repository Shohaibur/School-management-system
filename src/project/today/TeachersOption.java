package project.today;

import java.util.InputMismatchException;
import java.util.Scanner;
public class TeachersOption extends TeacherInfo {
	public void main() {
		try {	
			
			Scanner s = new Scanner(System.in);
			TeacherInfo t1 = new TeacherInfo();
			
			System.out.println("1.View 2.Add 3.Delete 4.Update ");
			System.out.println("Enter your choice: ");
			menu = s.nextInt();
			do {
				switch(menu)
				{
				case 1:// System.out.println("\n");
				t1.TeacherInfoo();
				this.main();
				break;
				
				case 2: //System.out.println("\n");
				TeachAdd a1 = new TeachAdd();
				t1.TeacherInfoo();
				a1.TeacherAdd();
				this.main();
				break;
				
				case 3: //System.out.println("\n");
				TeachDelete d1 = new TeachDelete();
				t1.TeacherInfoo();
				d1.TeacherDelete();
				this.main();
				break;
				
				case 4: //System.out.println("\n");
				TeachUpdate u1 = new TeachUpdate();
				t1.TeacherInfoo();
				u1.TeacherUpdate();
				this.main();
				break;
				
				case 5: System.out.println("Invalid Input!!");
				this.main();
				System.out.println("Enter your choice: ");
				default:
				}
				
			} while(menu!=4);
			
		
		}
		catch (InputMismatchException err) {		
		System.out.print("Invalid Input");
		}
	}
		}
