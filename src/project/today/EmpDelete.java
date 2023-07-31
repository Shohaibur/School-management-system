package project.today;

import java.util.Scanner;
public class EmpDelete extends EmployeeInfo{
public void EmployeeDelete() {
		
		EmployeeInfo t1 = new EmployeeInfo();
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n Enter the slot you want to delete: ");
		eraser = s.nextInt();
		eraserheads = eraser-1;
		
		if(eraser>0&&Id[eraserheads]!=0)
		{
			Name[eraserheads]="empty";
			Id[eraserheads]=1;
			Section[eraserheads]="empty";
			Email[eraserheads]="empty";
			
			System.out.println("Employee information has been deleted.");
		}
		else
		{
			System.out.println("try again");
		}
			}

}

