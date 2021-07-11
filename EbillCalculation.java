

public class EbillCalculation {
 
	public static void main(String args[]) {
		System.out.println("Calculate your Electricity bills here!");
		Calculate ca= new Calculate();
		ca.calculateBill(280);
		
		
	}
}

class Calculate{
	 float units;
	 double bill;
	 
	 void calculateBill(float units)
	 {
		 if(units==100) {
			 bill= units * 1.20;
		 }
		 else if(units<=300) {
			 bill=(units-100)*2 + (100* 1.20);
		 }
		 else {
			 bill = (units-300)*3 + (200*2) +(100 * 1.20); 
		 }
		 
		 System.out.println("The bill amount is "+ bill + " rupees");
	 }
	 
	
	 
}