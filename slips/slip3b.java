/*
Slip3b
Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report).
Create an object of patient. Handle appropriate exception while patient oxygen level less than
95% and HRCT scan report greater than 10, then throw user defined Exception “Patient is Covid
Positive(+) and Need to Hospitalized” otherwise display its information.
*/

import java.util.*;

class CovidException extends Exception {
	CovidException(){
		super("Patient is Covid Positive and Needs to be Hospitalized\n");
	}
}

class Patient {
	String pname;
	int page, poxy, phrct;
	
	void set(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter patient name: ");
		pname = sc.next();
		System.out.print("Enter patient age: ");
		page = sc.nextInt();
		System.out.print("Enter patient Oxygen levels: ");
		poxy = sc.nextInt();
		System.out.print("Enter patient HRCT report: ");
		phrct = sc.nextInt();
	}
	
	
	void get() throws CovidException {
		System.out.println(pname + "\t" + page + "\t" + poxy + "\t" + phrct);
		if(poxy <= 95 && phrct >= 10){
			throw new CovidException();
		}
	}
}

class slip3b {
	public static void main(String args[]){
		while (true){
			Patient p = new Patient();
			p.set();
			try {
				p.get();			
			} catch (CovidException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
