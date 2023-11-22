package Object;

public class Professor {
	int ID;
	String Name, Department, Lab;
	public Professor(int _ID, String _Name, String _Department, String _Lab){
		ID=_ID; Name=_Name; Department= _Department; Lab=_Lab;
	}
	public void showPro() {
	      System.out.println("("+ID+"  " +Name+"  " +  Department+"  " +Lab+")");
	}
	public String getName() {return Name;}
	public String getDep() {return Department;}
}
