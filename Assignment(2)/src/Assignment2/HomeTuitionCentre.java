package Assignment2;

//2.4 Abstraction
public abstract class HomeTuitionCentre {  // 2.4 Abstraction
	
	protected String tuitionname,areas,subjects,tuitioncontactnum;
	
	public HomeTuitionCentre() { // constructor with no parameter
	}
	
	public HomeTuitionCentre(String tn, String a, String s, String cn) { //constructor with 4 parameters
		
		this.tuitionname= tn;
		this.areas = a;
		this.subjects = s;
		this.tuitioncontactnum = cn;
		
		System.out.println("************************* " + tn + "****************************");
		System.out.println("Areas            : " + a);
		System.out.println("Subjects         : " + s);
		System.out.println("Contact Number   : " + cn);
		System.out.println();
	}


}