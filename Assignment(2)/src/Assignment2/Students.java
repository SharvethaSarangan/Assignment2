package Assignment2;

import java.util.Scanner;  // 1.2 Pre-Define class

public class Students extends Subjects implements Payment  {  // 2.1 Inheritance & 2.5 Interface

	//declare variables
	 protected String name, icnum , phonenum , emailaddress;
	 protected int subject;
	 protected double discount ,fee , totalfee;
	 
	 public Students() {  // inherits from parent class
			super();
		}
	

	Scanner s = new Scanner(System.in);
	

	    // 1.4 constructor with zero argument
		public void getInput() {
		System.out.print("\n\n**********************************STUDENT REGISTRATION************************************");
	    System.out.print("\nEnter your name                  : ");
	    name = s.nextLine();
	    System.out.print("Enter your identification number : ");
	    icnum = s.nextLine();
	    System.out.print("Enter your phone number          : ");
	    phonenum = s.nextLine();
	    System.out.print("Enter your email address         : ");
	    emailaddress = s.nextLine();
	 }
		
		public double getPayment(int sub) { // overriding with 1 parameter
			return (sub*80);
		}

		public double getPayment(int sub, double discount) {  //overriding with 2 parameters
			return (sub*80)-((sub*80)*0.1);   }
		
		public String toString() {  // 2.2 Polymorphism
			
			 return "\n************************************************************" +
				 	"\nStudent's Name              : "  + this.name	  +
				 	"\nIdentification number       : "  + this.icnum   +
				    "\nPhone Number                : "  + this.phonenum+
				    "\nEmailaddress                : "  + this.emailaddress  +
				 	"\n************************************************************";
					
		}  //end of toString
		

	    } // end of class
