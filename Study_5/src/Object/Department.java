package Object;

public class Department {
	int ID;
	String department;
	public Department(int _ID, String _department) {
		ID=_ID; department= _department;
	}
	public void showDep() {
	     System.out.println("  ("+ID+"."+ department+")");
	}
	public int getID() {return ID;}
	public String getDep() {return department;}
}
