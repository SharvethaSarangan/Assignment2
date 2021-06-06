package Assignment2;

public class Marketing {
	
	// declare all variables
	String Fb ; 
	String IG ;
	int whatsapp;
	String discount;
	
	public Marketing (String i , String j , int k, String l) { // Constructor with 4 arguments
		this.Fb = i;
		this.IG = j;
		this.whatsapp = k;
		this.discount = l;   }
	
		// 2.3 Encapsulation
	    // setter method
		public void setFb(String i)  {
			this.Fb = i;
		}
		
		public void setIG(String j)  {
			this.IG = j;
		}
		
		public void setwhatsapp(int k)  {
			this.whatsapp = k;
		}
		
		public void setdiscount(String l) {
			this.discount = l;
		}
		
		// getter method
		public String getFb()  {
			return Fb;
		}
		
		public String getIG()  {
			return IG;
		}
		
		public int getwhatsapp()  {
			return whatsapp;
		}
		
		public String getdiscount()  {
			return discount;
		}
		
		 public String toString() {  // 2.2 Polymorphism
				return "\n*********************************************************************************************************************************************" +
					   "\nFor further enquiries and questions please do refer : " + this.Fb +this.IG + this.whatsapp +
					   "\nThere will be a special discount for the early birds. We will provide 10% discount to the first 30 students for the first 5 months" +
					   "\n*********************************************************************************************************************************************";
	
		 }
} // end of class

