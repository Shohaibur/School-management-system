package project.today;

import java.util.Scanner;
public class TeacherInfo {
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
	public static int TeacherUpdte,TeacherDelete,Teacheradd,menu;
	
	public void display()
	{
		TeacherInfo t1 = new TeacherInfo();
		Scanner s = new Scanner(System.in);
		
		
		TeachersOption m2 = new TeachersOption();
		m2.main();
	}
	
	public void TeacherInfoo()
	{
		System.out.println("Welcome to Teachers Information");
		
		System.out.println("\n Name \t\t Id \t\t Section \t\t Email \n");
		
		for(i=1;i<4;i++)
		{
			set=i-1;
			System.out.print("("+i+")" +Name[set]+"\t" + Id[set] +"\t\t"+ Section[set]+ "\t\t\t" + Email[set] + "\t\t\n");
			
		}
	}




}