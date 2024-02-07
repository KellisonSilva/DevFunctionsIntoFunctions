package application;

import java.util.Scanner;
import Services.BrazilianInterestService;
import Services.InterestService;
import Services.USAInterestService;

public class application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();

		InterestService BR = new BrazilianInterestService(2.0);
		Double paymentBr = BR.payment(amount, months);
		System.out.println("Payment after " + months + " months: " + String.format("%.2f", paymentBr));

		InterestService USA = new USAInterestService(1.0);
		USA.payment(amount, months);
		Double paymentUsa = USA.payment(amount, months);
		System.out.println("Payment after " + months + " months: " + String.format("%.2f", paymentUsa));

		sc.close();
	}

}
