/*
Slip 6 a
Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal)
information using toString().
*/

class Employee {
	int eid, esal;
	String ename, edeg;
	
	Employee(int eid, int esal, String ename, String edeg){
		this.eid=eid;
		this.esal=esal;
		this.ename=ename;
		this.edeg=edeg;
	}
}

class slip6a {
	public static void main(String args[]){
		Employee e = new Employee(1,10000, "AK", "IT");
		System.out.println(e.toString());
	}
}
