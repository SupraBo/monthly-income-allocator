import java.util.Scanner;

public class Main {

	public static double safeAssests(int a, double i) {
		//Round the age to nearest multiple of 10	
		int x = (a/10)*10;  
		int y = x + 10; //Next Rounded Number
		
		double agePercent = y * 0.01;
		double safeFund = i * agePercent;
		return safeFund;
		
	}
	
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter your age");
	int age = sc.nextInt();
	System.out.println("Enter this month's Net Income");
	double income = sc.nextDouble();
	sc.close();
	
	if(age<90) {
	double finalsafeFund = safeAssests(age, income);
	double finalyourFund = income* 0.05;
	double sum = finalsafeFund + finalyourFund;
	double riskyFund = income - sum;
	
	//Part 1 (Safe Fund)
	//Dividing Safe Fund into 70% and 30%
	double savingsAcc = 0.7 * finalsafeFund;
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
	
	//Part 3 (Risk Fund)
	//Dividing Risk Fund into 70% and 30%
	double longTerm = riskyFund * 0.7;
	double shortTerm = riskyFund - longTerm;
	System.out.println("RISK FUND");
	System.out.println("Put it in your Long Term investment(Stocks, Crypto etc.): "+ longTerm);
	System.out.println("Use it for Short Term money gain(Trading etc.): "+ shortTerm);
	}
	
	else {
		System.out.println("You are 90+ years young. Chill, don't worry about wealth now!");
	}
	
	
	}

}
