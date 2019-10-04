package com.cg.ibsproject.ui;

import java.util.Scanner;

import com.cg.ibsproject.service.BankService;
import com.cg.ibsproject.service.BankServiceImpl;

public class User {
	private static Scanner read;
	BankService bankService = new BankServiceImpl();

	public void init() {
		CustomerOptions customerChoice = null;
		while (customerChoice != CustomerOptions.EXIT) {
			System.out.println("Menu");
			System.out.println("--------------------");
			System.out.println("Choice");
			System.out.println("--------------------");
			for (CustomerOptions menu : CustomerOptions.values()) {
				System.out.println((menu.ordinal() + 1) + "\t" + menu);
			}
			System.out.println("Choice");
			int ordinal = read.nextInt();
			if (ordinal >= 1 && ordinal < (CustomerOptions.values().length) + 1) {
				customerChoice = CustomerOptions.values()[ordinal - 1];
				switch (customerChoice) {
				case APPLY_LOAN:
					selectLoanType();
					break;
				case PAY_EMI:
					break;
				case APPLY_PRECLOSURE:
					break;
				case VIEW_HISTORY:
					break;
				case EXIT:
					System.out.println("Thank You! Come Again.");
					break;
				}

			} else {
				System.out.println("Invalid Option.");
				customerChoice = null;
			}
		}
	}

	public void selectLoanType() {
		LoanTypes choice = null;
		while (choice != LoanTypes.GO_BACK) {
			System.out.println("Menu");
			System.out.println("--------------------");
			System.out.println("Choice");
			System.out.println("--------------------");
			for (LoanTypes menu : LoanTypes.values()) {
				System.out.println((menu.ordinal() + 1) + "\t" + menu);
			}
			System.out.println("Choice");
			int ordinal = read.nextInt();
			if (ordinal >= 1 && ordinal < (LoanTypes.values().length) + 1) {
				choice = LoanTypes.values()[ordinal - 1];

				switch (choice) {
				case HOME_LOAN:
					displayHomeLoan();
					break;
				case EDUCATION_LOAN:
					displayEducationLoan();
					break;
				case PERSONAL_LOAN:
					displayPersonalLoan();
					break;
				case VEHICLE_LOAN:
					displayVehicleLoan();
					break;
				case GO_BACK:
					System.out.println("Thank You!");
					break;
				}
			} else {
				System.out.println("Invalid Loan Type Selection!!");
				choice = null;

			}

		}

	}

	private double displayLoan() {
		System.out.println("Welcome to IBS Bank loan scheme!");
		System.out.println("Please enter the required amount of loan.");
		return read.nextDouble();

	}

	private void displayHomeLoan() {
		User display = new User();
		double validLoanAmount = display.displayLoan();

		boolean resultAmount = bankService.isValidHomeLoanAmount(validLoanAmount);

		if (resultAmount) {
			System.out.println("Rate of interest for home loan:" + bankService.sendInterestHomeLoan());
			System.out.println("Please enter the tenure(in months) you would like to have loan.");
			System.out.println(
					"Following are the options for which you can apply loan: \n 1. 6 Months \n 2. 12 Months \n 3. 18 Months");
			int tenure = read.nextInt();
			boolean resultTenure = bankService.isValidTenure(tenure);
			if (resultTenure) {
				double emiAmount = bankService.sendEMIForHomeLoan(validLoanAmount, tenure);
				System.out.println("EMI Amount is: INR " + emiAmount);
				// String loanType = "Home Loan!";
				double homeLoanInterest = bankService.sendInterestHomeLoan();
				// bankService.setLoanDetails(loanType, validLoanAmount,
				// homeLoanInterest, tenure);
			} else {
				System.out.println("Sorry! This bank doesn't provide loan for this tenure.");

			}
		} else {
			System.out.println("Please enter a valid loan amount.");
		}

	}

	private void displayEducationLoan() {
		User display = new User();
		double validatedLoanAmount = display.displayLoan();
		boolean resultAmount = bankService.isValidEducationLoanAmount(validatedLoanAmount);
		if (resultAmount) {
			System.out.println("Rate of interest for education loan:" + bankService.sendInterestEducationLoan());
			System.out.println("Please enter the tenure(in months) you would like to have loan.");
			System.out.println(
					"Following are the options for which you can apply loan: \n 1. 6 Months \n 2. 12 Months \n 3. 18 Months");
			int tenure = read.nextInt();
			boolean resultTenure = bankService.isValidTenure(tenure);
			if (resultTenure) {
				double emiAmount = bankService.sendEMIForEducationLoan(validatedLoanAmount, tenure);
				System.out.println("EMI Amount is: INR " + emiAmount);
			} else {
				System.out.println("Sorry! This bank doesn't provide loan for this tenure.");

			}
		} else {
			System.out.println("Please enter a valid loan amount.");
		}

	}

	private void displayVehicleLoan() {
		User display = new User();
		double validatedLoanAmount = display.displayLoan();
		boolean resultAmount = bankService.isValidVehicleLoanAmount(validatedLoanAmount);
		if (resultAmount) {
			System.out.println("Rate of interest for personal loan:" + bankService.sendInterestVehicelLoan());
			System.out.println("Please enter the tenure(in months) you would like to have loan.");
			System.out.println(
					"Following are the options for which you can apply loan: \n 1. 6 Months \n 2. 12 Months \n 3. 18 Months");
			int tenure = read.nextInt();
			boolean resultTenure = bankService.isValidTenure(tenure);
			if (resultTenure) {
				double emiAmount = bankService.sendEMIForVehicleLoan(validatedLoanAmount, tenure);
				System.out.println("EMI Amount is: INR " + emiAmount);
			} else {
				System.out.println("Sorry! This bank doesn't provide loan for this tenure.");

			}
		} else {
			System.out.println("Please enter a valid loan amount.");
		}

	}

	private void displayPersonalLoan() {
		User display = new User();
		double validatedLoanAmount = display.displayLoan();
		boolean resultAmount = bankService.isValidPersonalLoanAmount(validatedLoanAmount);
		if (resultAmount) {
			System.out.println("Rate of interest for personal loan:" + bankService.sendInterestPersonalLoan());
			System.out.println("Please enter the tenure(in months) you would like to have loan.");
			System.out.println(
					"Following are the options for which you can apply loan: \n 1. 6 Months \n 2. 12 Months \n 3. 18 Months");
			int tenure = read.nextInt();
			boolean resultTenure = bankService.isValidTenure(tenure);
			if (resultTenure) {
				double emiAmount = bankService.sendEMIForPersonalLoan(validatedLoanAmount, tenure);
				System.out.println("EMI Amount is: INR " + emiAmount);
			} else {
				System.out.println("Sorry! This bank doesn't provide loan for this tenure.");

			}
		} else {
			System.out.println("Please enter a valid loan amount.");
		}

	}

	public static void main(String[] args) {
		read = new Scanner(System.in);
		User user = new User();
		user.init();
		read.close();
	}
}
