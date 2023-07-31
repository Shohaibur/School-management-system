package project.today;

import java.util.Scanner;
public class TeachDelete extends TeacherInfo{
	public void TeacherDelete() {
		
		TeacherInfo t1 = new TeacherInfo();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the slot you want to delete: ");
		eraser = s.nextInt();
		eraserheads = eraser-1;
		
		if(eraser>0&&Id[eraserheads]!=0)
		{
			Name[eraserheads]="empty";
			Id[eraserheads]=1;
			Section[eraserheads]="empty";
			Email[eraserheads]="empty";
			
			System.out.println("Teacher information has been deleted.");
		}
		else
		{
			System.out.println("try again");
		}
			}
	}
