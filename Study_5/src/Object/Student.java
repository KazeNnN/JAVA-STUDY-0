package Object;

public class Student {
	int ID,Grade;
	String Department ,Major, name;
	public Student(int _ID, String _name, String _Department, String _Major, int _Grade) {
		ID=_ID ; name=_name; Department=_Department; Major=_Major; Grade=_Grade;
	}
	public void stuShow() {
	      System.out.println("("+ID+"  " +name+"  " +  Department+"  " +Major+"  " +Grade+")");
	}
	public String getName() {return name;}
	public String getDep() {return Department;}
}
