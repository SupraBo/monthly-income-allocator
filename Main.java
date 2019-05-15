import java.util.Scanner;

public class Main {

	public static double safeAssests(int a, double i) {
		double agePercent = a * 0.01;
		double safeFund = i * agePercent;
		return safeFund;
		
	}
	
	
	public static double own(int ag, double in) {
	
	//Round the age to nearest multiple of 10	
		int x = (ag/10)*10;  
        int y = x + 10; //Next Rounded Number
        
        int exactPercentNumber = y-ag;
        double exactPercent = exactPercentNumber*0.01;
	    double yourFund = in * exactPercent;
		return yourFund;
	}
	
	
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter your age");
	int age = sc.nextInt();
	System.out.println("Enter this month's Net Income");
	double income = sc.nextDouble();
	sc.close();
	
	if(age<100) {
	double finalsafeFund = safeAssests(age, income);
	double finalyourFund = own(age, income);
	double sum = finalsafeFund + finalyourFund;
	double riskyFund = income - sum;
	
	//Part 1 (Safe Fund)
	//Dividing Safe Fund into 60% and 40%
	double savingsAcc = 0.6 * finalsafeFund;
	double longAcc = finalsafeFund - savingsAcc;
	System.out.println();
	System.out.println("SAFE FUND");
	System.out.println("Put into your Savings Bank Account: " + savingsAcc);
	System.out.println("Put into Long Term Funds(PPF, FD etc.): " + longAcc + System.lineSeparator());
	
	//Part 2 (You)
	//Dividing You Fund into 50% and 50%
	double yourself = finalyourFund * 0.5;
	double business = finalyourFund - yourself;
	System.out.println("YOU FUND");
	System.out.println("Invest in Yourself: " + yourself);
	System.out.println("Invest in your passion/business: " + business + System.lineSeparator());
	
	//Part 3 (Risky Fund)
	//Dividing Risky Fund into 70% and 30%
	double longTerm = riskyFund * 0.7;
	double shortTerm = riskyFund - longTerm;
	System.out.println("RISKY FUND");
	System.out.println("Put it in your Long Term investment(Stocks, Crypto etc.): "+ longTerm);
	System.out.println("Use it for Short Term money gain(Trading etc.): "+ shortTerm);
	}
	
	else {
		System.out.println("You are 100+ years young. Damn bro, you got your health 100% right. Why worry about wealth now?");
	}
	
	
	}

}
