import Manage.*;
import java.util.Scanner;
import Screen.MainScreen;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		MemberManager membermanager = new MemberManager(50);
		MainScreen mainscreen = new MainScreen();
		
		membermanager.initStu();
		membermanager.initPro();
		membermanager.initDep();
		
		for(;;) {
			mainscreen.Screen();
		
			int select = scanner.nextInt();
			switch(select) {
			case 1: 
			{
				membermanager.addStu();
				break;
			}
			case 2:
			{
				membermanager.showAllStu();
				break;
			}
			case 3: 
			{
				membermanager.addPro();
				break;
			}
			case 4:
			{
				membermanager.showAllPro();
				break;
			}
			case 5:{
				membermanager.showOneMember();
				break;
			}
			case 6:
			{
				membermanager.showAllMember();
				break;
			}
			case 7:
			{
				membermanager.addDep();
				break;
			}
			case 8:
			{
				membermanager.showAllDep();
				break;
			}
			case 9:
			{
				membermanager.memberByDep();
				break;
			}
			case 0:
			{
				return;
			}
			}
		}
	}
}
