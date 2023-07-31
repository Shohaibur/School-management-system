package project.today;

import java.util.Scanner;
public class TeachAdd extends TeacherInfo{
	public void TeacherAdd() {
		
		TeacherInfo t1 = new TeacherInfo();
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.print("Enter the slot you want to add:");
			add = s.nextInt();
			//System.out.print("\n");
			lucban=1;
			adds=add-1;
		
		}
		catch(Exception error){
			System.out.println("Invalid Input!!");
			TeacherAdd();
		}
			try {
				if(Id[adds]!=0 && add>0)
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
							TeacherAdd();
						}
						
					}
					if(slot1>0);
					{
						Name[adds]=slot4;
						Section[adds]=slot3;
						Email[adds]=slot2;
						Id[adds]=slot1;
					
						System.out.println("Teacher information has been added");
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

