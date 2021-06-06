package Assignment2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Finance extends Staffs implements Payment{  //2.1 Inheritance & 2.5 Interface
	
	Scanner f = new Scanner(System.in);
	protected static DecimalFormat df2 = new DecimalFormat("#.##");
	
	// declare the variables
	String name;
	private char choice;
	private double payment, expenses, profit;  
	

	public Finance(int e, String n, double h) {   // inherits from main class
		super(e, n, h);   }
		


				public void Calstudentsfee() {  // constructor with zero arguments
				do {
				payment++;
				System.out.println("\n\n***************************************FINANCE***************************************");
				f.nextLine();
			    System.out.print("Enter student's name                                   : ");
			    name = f.nextLine();
			    System.out.print("Enter the payment made by the student                  : ");
			    payment = f.nextDouble(); 
			    
				
				System.out.print("\nAdd other students' details? (Y or N)                  : ");
			    choice = f.next().charAt(0);

			    } while (choice == 'Y' || choice == 'y'); } // end of Calstudentsfee

				public void Expenses()  {   // method to calculate expenses
					System.out.print("Enter the total amount of expenses made for tuition    : ");
					expenses = f.nextDouble();
				} 
				
				public void CalProfit() {   // method to calculate total profit of Home Tuition
					profit = payment-(expenses+super.CalTotalSalary()); // inherits from parent class(Staffs)
				}
				
				public double getPayment(int subject) { // overriding with 1 parameter
					return 0;
				}

				public double getPayment(int subject, double discount) {  //overriding with 2 parameters
					return 0;
				}
				
				public String toString() {  // 2.2 Polymorphism
					
					 return
							"\n************************************************************"  +
						 	"\nStudent's Name              : "    + name                     +
						 	"\nPayment made by the student : RM "  + df2.format(payment) +
						    "\nTotal expenses of the month : RM "  + df2.format(expenses)+
						    "\nStaff name                  : "  +super.name+
						    "\nSalary of the staff         : RM "  + df2.format(super.CalTotalSalary())+
						    "\nTotal Profit of the month is: RM "  + df2.format(profit)  +
						 	"\n************************************************************";
							
				} // end of toString
	

				} // end of class

