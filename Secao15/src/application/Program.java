package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Integer number = 8021;
		String holder = "Bob";
		Double balance = 200.00;
		Double withdrawLimit = 300.00;
		Double witdraw;
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		try {
			System.out.print("Enter amount for withdraw: ");
			witdraw = sc.nextDouble();
			account.withdraw(witdraw);
		} catch (InputMismatchException e) {
			System.out.print("Wrong value ");
		}
	}

}
