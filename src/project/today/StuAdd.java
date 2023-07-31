package project.today;

import java.util.Scanner;

public class StuAdd extends StuInfo{
public void StudentAdd() {
	
		StuInfo s1 = new StuInfo();
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.print("\n Enter the slot you want to add:");
			add = s.nextInt();
			System.out.print("\n");
			lucban=1;
			adds=add-1;
		
		}
		catch(Exception error){
			System.out.println("Invalid Input!!");
			StudentAdd();
		}
			try {
				if(Id[adds]!=0 && add>0)
				{
					do
					{
						
						{
						System.out.print("Enter Name: ");
						slot6 = s.next();
						System.out.print("Enter Section: ");
						slot5 = s.next();
						System.out.print("Enter Email: ");
						slot4 = s.next();
						System.out.print("Enter Birthday: ");
						slot3 = s.next();
						System.out.print("Enter Address: ");
						slot2 = s.next();
						System.out.print("Enter Id: ");
						slot1 = s.nextInt();
						
						
						if(slot1 <1){
							System.out.println("Invalid Input!!");
							StudentAdd();
						}
						
					}
					if(slot1>0);
					{
						Name[adds]=slot6;
						Section[adds]=slot5;
						Email[adds]=slot4;
						Birthday[adds]=slot3;
						Address[adds]=slot2;
						Id[adds]=slot1;
					
						System.out.println("Student information has been added.");
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
			
				System.out.println("invalid input");
				m.main();
			}
	}
}

