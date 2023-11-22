package Manage;
import java.util.*;
import Object.*;
public class MemberManager {
	int index,depIndex;
	Student student[];
	Professor professor[];
	Department department[];
	
	public MemberManager(int max){
		student = new Student[max];
		professor = new Professor[max];
		department= new Department[20];
	}
	public void initStu() {
		student[index++]= new Student(index,"홍학생","컴퓨터공학부","소프트웨어",2);
		student[index++]= new Student(index,"김학생","컴퓨터공학부","컴퓨터공학",3);
		student[index++]= new Student(index,"박학생","게임공학과","게임공학",4);
	}
	public void initPro() {
		professor[index++]= new Professor(index,"홍교수","컴퓨터공학부","E311");
		professor[index++]= new Professor(index,"김교수","게임공학과","E331");
	}
	public void initDep() {
		department[depIndex++] = new Department(depIndex,"컴퓨터공학부");
		department[depIndex++] = new Department(depIndex,"게임공학과");
		department[depIndex++] = new Department(depIndex,"전자공학부");
	}
	public void addStu() {
	    System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("<1.  학생  추가>");
		int ID = + index+1;
		System.out.println("  - ID  :  "+ID);
		System.out.print("  - 이름  :  ");
		String name = scanner.next();
	     System.out.println("---------------------------");
	     System.out.println("  (학부(과)  ID)");
	     System.out.println("---------------------------");
	     for(int i=0;i<depIndex;i++)
	     {
	    	 if(department!=null) {
	    		 department[i].showDep();
	    	 }
	     }
	     System.out.println("---------------------------");
		System.out.print("  - 학부(과)  ID  :  ");
		int depID = scanner.nextInt();
		String dep="";
	     for(int i=0;i<depIndex;i++)
	     {
	    	 if(department!=null) {
	    		 if(depID==department[i].getID())
	    			 dep=department[i].getDep();
	    	 }
	     }
		System.out.print("  - 전공  :  ");
		String major = scanner.next();
		System.out.print("  - 학년  :  ");
		int grade = scanner.nextInt();
		
		student[index++]= new Student(ID,name,dep,major,grade);
		System.out.println("  =>  "+name+"  학생을 추가하였습니다\n");
	}
	public void showAllStu() {
	    System.out.println();
		System.out.println("<2.  학생  목록>");
	      System.out.println("-------------------------------------------------");
	      System.out.println("(ID,  이름,  소속학부(과),  전공,  학년)");
	      System.out.println("-------------------------------------------------");
		for(int i=0;i<index;i++)
		{
			if(student[i]!=null) {
				student[i].stuShow();
			}
		}
	     System.out.println("-------------------------------------------------");
		System.out.println();
	}

public void addPro() {
    System.out.println();
	Scanner scanner = new Scanner(System.in);
	System.out.println("<3.  교수  추가>");
	int ID = + index+1;
	System.out.println("  - ID  :  "+ID);
	System.out.print("  - 이름  :  ");
	String name = scanner.next();
     System.out.println("---------------------------");
     System.out.println("  학부(과)  ID)");
     System.out.println("---------------------------");
     for(int i=0;i<depIndex;i++)
     {
    	 if(department!=null) {
    		 department[i].showDep();
    	 }
     }
     System.out.println("---------------------------");
	System.out.print("  -  소속  학부(과)  ID  :  ");
	int depID = scanner.nextInt();
	System.out.print("  -  연구실  :  ");
	String Lab = scanner.next();
	String dep="";
    for(int i=0;i<depIndex;i++)
    {
   	 if(department!=null) {
   		 if(depID==department[i].getID())
   			 dep=department[i].getDep();
   	 }
    }
	
	professor[index++]= new Professor(ID,name,dep,Lab);
	System.out.println("  =>  "+name+"  교수를 추가하였습니다\n");
}

public void showAllPro() {
    System.out.println();
	System.out.println("<4.  교수  목록>");
    System.out.println("-------------------------------------------------");
    System.out.println("(ID,  이름,  소속,  연구실)");
    System.out.println("-------------------------------------------------");
	for(int i=0;i<index;i++)
	{
		if(professor[i]!=null) {
			professor[i].showPro();
		}
	}
   System.out.println("-------------------------------------------------");
	System.out.println();
}

public void showOneMember() {
    System.out.println();
	System.out.println("<5.  구성원  조회>");
	Scanner scanner = new Scanner(System.in);
	System.out.print("  - 이름  :  ");
	String name = scanner.next();
	System.out.println("  < 찾은  멤버 >");
    System.out.println("-------------------------------------------------");
    System.out.println("(구분)\t(ID,  이름,  소속학부(과),  전공,  학년)");
    System.out.println("\t\t(ID,  이름,  소속,  연구실)");
    System.out.println("-------------------------------------------------");
    for(int i=0;i<index;i++)
    {
    	if(student[i]!=null)
    	{
    		if(name.equals(student[i].getName()))
    		{
    			System.out.print("(학생)\t");
				student[i].stuShow();
    		}
    	}
    	if(professor[i]!=null)
    	{
    		if(name.equals(professor[i].getName()))
    		{
    			System.out.print("(교수)\t");
				professor[i].showPro();
    		}
    	}
    }
    System.out.println("-------------------------------------------------");   
    System.out.println();
}
public void showAllMember() {
	System.out.println("<6.  전체  구성원  목록>");
    System.out.println("-------------------------------------------------");
    System.out.println("(구분)\t(ID,  이름,  소속학부(과),  전공,  학년)");
    System.out.println("\t\t(ID,  이름,  소속,  연구실)");
    System.out.println("-------------------------------------------------");
    for(int i=0;i<index;i++)
    {
    	if(student[i]!=null)
    	{
    			System.out.print("(학생)\t");
				student[i].stuShow();
    	}
    	if(professor[i]!=null)
    	{
    			System.out.print("(교수)\t");
				professor[i].showPro();
    	}
    }
    System.out.println("-------------------------------------------------");   
    System.out.println();
}
public void addDep() {
    System.out.println();
	System.out.println("<7.  학부(과)  추가>");
	Scanner scanner = new Scanner(System.in);
	int ID = depIndex+1;
	System.out.println("  - ID  :  "+ID);
	System.out.print("  - 이름  :  ");
	String name = scanner.next();
	
	System.out.println("  =>  "+name+"  학부(과)를  추가하였습니다\n");
	department[depIndex++] = new Department(depIndex,name);
}
public void showAllDep() {
    System.out.println();
	System.out.println("<8.  모든  학부(과)  목록>");
	   System.out.println("-------------------------------------------------");
	    System.out.println("(ID,  학과(부)  )");
	   System.out.println("-------------------------------------------------");
	for(int i=0;i<depIndex;i++)
	{
		if(department!=null) {
			department[i].showDep();
		}	
	}
	   System.out.println("-------------------------------------------------");
	   System.out.println();
}
public void memberByDep() {
	Scanner scanner = new Scanner(System.in);
    System.out.println();
	System.out.println("<9.  학부(과)별  구성원  목록>");
	   System.out.println("-------------------------------------------------");
	    System.out.println("(ID,  학부(과)  )");
	   System.out.println("-------------------------------------------------");

	for(int i=0;i<depIndex;i++)
	{
		if(department!=null) {
			department[i].showDep();
		}	
	}
	System.out.print("  -  학부(과)  ID  :  ");
	int depID = scanner.nextInt();
	String dep="";
     for(int i=0;i<depIndex;i++)
     {
    	 if(department!=null) {
    		 if(depID==department[i].getID())
    			 dep=department[i].getDep();
    	 }
     }
     
 	System.out.println("<"+dep+"  :  구성원  목록>");
	System.out.println("-------------------------------------------------");
    System.out.println("(구분)\t(ID,  이름,  소속학부(과),  전공,  학년)");
    System.out.println("\t\t(ID,  이름,  소속,  연구실)");
	System.out.println("-------------------------------------------------");
	   for(int i=0;i<index;i++)
	    {
	    	if(student[i]!=null)
	    	{
	    		if(student[i].getDep().equals(dep))
	    		{
	    			System.out.print("(학생)\t");
					student[i].stuShow();
	    		}
	    	}
	    	if(professor[i]!=null)
	    	{
	    		if(professor[i].getDep().equals(dep))
	    		{
	    			System.out.print("(교수)\t");
					professor[i].showPro();
	    		}
	    	}
	    }
	    System.out.println("-------------------------------------------------");   
	    System.out.println();
	
}
}