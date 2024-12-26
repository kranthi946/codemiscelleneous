package Gainer;

import java.lang.reflect.Method;

public class GainerItem {
	
	    private String companyName;
	    private double prevClose;
	    private double currentPrice;
	    private double percentChange;

		private String employee ;

		private String gender;

		private Boolean martialstatus ;
	    public GainerItem(String companyName, double prevClose, double currentPrice, double percentChange, String employee, String gender, Boolean martialstatus) {
	        this.companyName = companyName;
	        this.prevClose = prevClose;
	        this.currentPrice = currentPrice;
	        this.percentChange = percentChange;
			this.employee = employee;

			this.gender = gender;
			this.martialstatus = martialstatus;

	    }

	    // Getters

	public String getGender(){

			return gender;
	}


	public Boolean getMartialstatus(){

			return martialstatus;
	}




	    public String getCompanyName() {
	        return companyName;
	    }

	    public double getPrevClose() {
	        return prevClose;
	    }

	    public double getCurrentPrice() {
	        return currentPrice;
	    }

	    public double getPercentChange() {
	        return percentChange;
	    }

		public String getEmployee() {
			return employee;
		}
	    
	    @Override
	    public String toString() {
	        return "Company: " + companyName +
	                ", Prev Close: " + prevClose +
	                ", Current Price: " + currentPrice +
	                ", % Change: " + percentChange;
	    }
	    
	    
	    
	    
	    public static String testMethod1() {
	        System.out.println("testMethod1");
	        
	        // Define what to return
	        String result = "kranthi"; // Replace with your desired return value
	        return result;
	    }

	    
	    public static void testMethod2() {
System.out.println("testmethod2");
	    }
	    
	}

	
	



