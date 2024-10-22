package intcalc;
import java.util.Scanner;
import java.text.DecimalFormat;

public class IntCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		Scanner scanner = new Scanner(System.in);
		String choice;
		//this is a do/while because we run once first
		do {
		//loan input
		System.out.print("Enter loan amount: ");
		double loan = scanner.nextDouble();
		
		//interest rate input
		System.out.print("Enter interest rate: ");
		double intRate = scanner.nextDouble();
		
		//interest
		double interest = loan * intRate;
		
		//format loan and interest with commas, format intrate as a percent
		DecimalFormat loanFormat = new DecimalFormat("$#,###.00");
		DecimalFormat interestFormat = new DecimalFormat("$#,###.00");
		DecimalFormat rateFormat = new DecimalFormat("#0.00%");
		
		System.out.println("Loan amount: " + loanFormat.format(loan));
		System.out.println("Interest rate: " + rateFormat.format(intRate));
		System.out.println("Interest: " + interestFormat.format(interest));
		System.out.print("Continue? (y/n): ");
		choice = scanner.next();
		}while(choice.equalsIgnoreCase("Y"));
	}

}
