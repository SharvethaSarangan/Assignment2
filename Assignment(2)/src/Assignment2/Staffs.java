package Assignment2;

import java.util.Scanner;  // Pre-define class
import java.text.DecimalFormat;

public class Staffs  { 

	Scanner e = new Scanner(System.in);
	protected static DecimalFormat df2 = new DecimalFormat("#.##");
	
	 // declaring all variables
	 public int empid;
	 public String name;
	 public double hours;
	 
	public Staffs(int e, String n, double h ) {
		empid = e;
		name = n;
		hours = h;
		}
		
		
		      public void StaffsDetails() {   // 1.4 Constructor with no argument
			  System.out.println("\n\n************************************TUTORS' DETAILS**************************************");
			  System.out.print("Enter the empid : ");
			  this.empid= e.nextInt();
			  e.nextLine();
			  System.out.print("Enter the name : ");
			  this.name = e.nextLine();
			  System.out.print("Enter the working hours : ");
			  this.hours = e.nextDouble();
			return;
			 } // end of constructor with zero argument
			 
			 public void StaffsDetails(int e) {  // Constructor with 1 argument
				 this.empid = e;
					System.out.println("\nDETAILS: ");
					System.out.println("Staff Id  : " + e);
					return;
					
				} // end of constructor with 1 argument
			 
			 public void StaffsDetails(int e, double h) {  // Constructor with 2 arguments
				 this.empid = e;
				 this.hours = h;
				 	System.out.println("Staff Id : " + e);
				 	System.out.println("Working Hours : " + h);
					return;
			 } // end of constructor with 2 arguments
			 
				//2.3 Encapsulation (create getter method)
			public int getempid() {
					return this.empid;
				}
				
			public double gethours() {
					return this.hours;
				}
			 
			 public double CalSalary()  {  // Method to calculate staff's salary
				 double salary = 15*hours ;
				 return salary;
			 } 
			 
			 public double CalIncrement()  {  //Method to calculate staffs' increment
			double increment = ((15*hours)*5)/100;
			return increment;
			 }
			 
			 public double CalTotalSalary()  {  // Method to calculate staffs' total salary
				  double totalsalary = CalSalary() + CalIncrement();
				  return totalsalary;
			 }
			 
			 public String toString() {  // 2.2 Polymorphism
					
					return "\n\nStaff Details : " + 
						   "\n*************************************************************************************" +
						   "\nStaff ID               : " + this.empid+
						   "\nStaff Name             : " + this.name +
						   "\nStaff Working Hours    : " + df2.format(this.hours)+"hours"+
						   "\nSalary                 : RM " + df2.format(CalSalary())+   
						   "\nStaff Increment        : RM " + df2.format(CalIncrement()) +
						   "\nTotal Salary           : RM " + df2.format(CalTotalSalary()) +
						   "\n*************************************************************************************";
						
				} // end of toString
		        } // end of class
			  

			          
