package Assignment2;

public class Main {

	public static void main(String[] args) {
		
		
		//HomeTuitionCentre h = new HomeTuitionCentre("SS HOME TUITION ","ALL AREAS AROUND JOHOR BAHRU","BAHASA MELAYU, ENGLISH, MATHEMATCS AND SCIENCE FOR FORM 3 AND FORM 5", "014-3166261");
		//System.out.println("**********************************"+h.gettuitionname()+"**********************************");
		//System.out.println("Areas Covered : "+ h.getareas());
		//System.out.println("Subjects offered : "+h.getsubjects());
		//System.out.println("Contact number : " + h.gettuitioncontactnum());
		
		Subjects ss = new Subjects("SS HOME TUITION ","ALL AREAS AROUND JOHOR BAHRU","BAHASA MELAYU, ENGLISH, MATHEMATCS AND SCIENCE FOR FORM 3 AND FORM 5", "014-3166261", 0, 0);
		ss.details();
		System.out.println(ss.toString());
		
		Marketing m = new Marketing("https://www.facebook.com/", "https://www.instagram.com/_sharvetha_/", 014-3166261, "10%");
		System.out.println(m.toString());
		
		Students s = new Students();
		s.getInput();
		System.out.println(s.toString());
		System.out.println("\n\nThe payment for 1 subject is RM " + s.getPayment(1));
		System.out.println("The payment for 1 subject with early bird discount is RM " + s.getPayment(1, 0.1));
		
		;
		Staffs e = new Staffs(12, "", 4);
		e.StaffsDetails();
		e.CalSalary();
		e.CalIncrement();
		e.CalTotalSalary();
		System.out.println(e.toString());
		
		Finance f = new Finance(0, "AHMAD BIN ABU", 2);
		f.Calstudentsfee();
		f.Expenses();
		f.CalIncrement();
		f.CalProfit();
		System.out.println(f.toString());
		
		

	}

}