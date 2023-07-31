package project.today;

import java.util.Scanner;
public class StuInfo {
	public static String[] Name = {"empty","empty","empty","empty","empty","empty"};
	public static String[] Birthday = {"empty","empty","empty","empty","empty","empty"};
	public static String[] Section = {"empty","empty","empty","empty","empty","empty"};
	public static String[] Email = {"empty","empty","empty","empty","empty","empty"};
	public static String[] Address = {"empty","empty","empty","empty","empty","empty"};
	public static int[] Id = {1,1,1,1,1,1};
	
	public static int i;
	public static int set;
	public static int g=1,edit,edits,lucban,adds,add;
	public static int slot1;
	String slot6, slot2, slot3,slot4, slot5;
	public static int eraser,eraserheads;
	public static int StudentUpdte,StudentDelete,StudentAdd,option;
	
	public void display()
	{
		StuInfo s1 = new StuInfo();
		Scanner s = new Scanner(System.in);
		
		
		MainOption m1 = new MainOption();
		m1.main();
	}
	
	public void StudentInfo()
	{
		System.out.println("Welcome to Students Information");
		System.out.println("Name \t\t Id \t\t Section \t\t Email \t\t Birthday \t\t Address \n");
		
		for(i=1;i<6;i++)
		{
			set=i-1;
			System.out.print("("+i+")" +Name[set]+"\t" + Id[set] +"\t\t"+ Section[set]+ "\t\t\t" + Email[set] + "\t\t"+Birthday[set]+" \t\t" +Address[set]+"\t\t\t\t\n");
			
		}
	}
}
