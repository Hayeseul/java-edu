package test.com;

public class DoubleInvestment {

	public static void main(String[] args) {

		final double RATE = 5;
		final double INITAL_BALANCE = 100000;
		final double TARGET = 2*INITAL_BALANCE; 
		
	
		double balance=INITAL_BALANCE; 
		int year =0;
		
		
		
		while ( balance <TARGET )
		{
		year++;
		double interst = balance * RATE /100;
		balance = balance +interst;
		}

		
		System.out.println("The investment doubled after " + year + "years");
		
	}

}
