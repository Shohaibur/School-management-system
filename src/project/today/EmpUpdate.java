package project.today;

import java.util.Scanner;
public class EmpUpdate extends EmpDelete{
	public void EmployeeUpdate() {
		EmployeeInfo e1 = new EmployeeInfo();
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("\n Enter the slot you want to update:");
			edit = s.nextInt();
			System.out.print("\n");
			lucban=1;
			edits=edit-1;
		
		}
		catch(Exception error){
			System.out.println("Invalid Input!!");
			EmployeeUpdate();
		}
			try {
				if(Id[edits]!=0 && edit>0)
				{
					do
					{
						
						{
						System.out.print("Enter Name: ");
						slot4 = s.next();
						System.out.print("Enter Section: ");
						slot3 = s.next();
						System.out.print("Enter Email: ");
						slot2 = s.next();
						System.out.print("Enter Id: ");
						slot1 = s.nextInt();
						
						
						if(slot1 <1){
							System.out.println("Invalid Input!!");
							EmployeeUpdate();
						}
						
					}
					if(slot1>0);
					{
						Name[edits]=slot4;
						Section[edits]=slot3;
						Email[edits]=slot2;
						Id[edits]=slot1;
					
						System.out.println("Employee information has been updated.");
						lucban++;
						
				}
						
				}while(lucban<2);
				}
			
			else
			{
				System.out.println("try again");
			}
		}
		
			catch(Exception oops) {
				MainOption m = new MainOption();
			
				System.out.print("invalid input");
				m.main();
			}
	}
}

