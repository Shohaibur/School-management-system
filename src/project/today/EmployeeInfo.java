package project.today;

import java.util.Scanner;
public class EmployeeInfo {
	public static String[] Name = {"empty","empty","empty","empty","empty","empty"};
	public static String[] Section = {"empty","empty","empty","empty","empty","empty"};
	public static String[] Email = {"empty","empty","empty","empty","empty","empty"};
	public static int[] Id = {1,1,1,1,1,1};
	
	public static int i;
	public static int set;
	public static int g=1,edit,edits,lucban,adds,add;
	public static int slot1;
	String slot4, slot2, slot3;
	public static int eraser,eraserheads;
	public static int EmployeeUpdte,EmployeeDelete,Employeeadd,section;
	
	public void display()
	{
		EmployeeInfo e1 = new EmployeeInfo();
		Scanner s = new Scanner(System.in);
		
		
		EmployeeOption m3 = new EmployeeOption();
		m3.main();
	}
	
	public void EmployeeInfo()
	{
		System.out.println("                                    Welcome to employees Information                                    ");
		System.out.println("Name \t\t Id \t\t Section \t\t Email \n");
		
		for(i=1;i<4;i++)
		{
			set=i-1;
			System.out.print("("+i+")" +Name[set]+"\t" + Id[set] +"\t\t"+ Section[set]+ "\t\t\t" + Email[set] + "\t\t\n");
			
		}
	}

}
