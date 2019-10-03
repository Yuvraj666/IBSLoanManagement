package com.cg.ibsproject.ui;

import java.util.Scanner;

import com.cg.ibsproject.service.*;

public class DisplayDetails {
	public static Scanner read;
	public BankService bankService = new BankServiceImpl();

	public void init() {
		LoanTypes choice = null;
		while (choice != LoanTypes.EXIT) {
			System.out.println("Menu");
			System.out.println("--------------------");
			System.out.println("Choice");
			System.out.println("--------------------");
			for (LoanTypes menu : LoanTypes.values()) {
				System.out.println(menu.ordinal() + "\t" + menu);
			}
			System.out.println("Choice");
			int ordinal = read.nextInt();
			if (ordinal >= 0 && ordinal < LoanTypes.values().length) {
				choice = LoanTypes.values()[ordinal];

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
				case EXIT:
					System.out.println("Thank You!");
					break;
				}
			} else {
				System.out.println("Invalid Option!!");
				choice = null;

			}

		}

	}

	private void displayVehicleLoan() {
		// TODO Auto-generated method stub

	}

	private void displayPersonalLoan() {
		// TODO Auto-generated method stub

	}

	private void displayEducationLoan() {
		// TODO Auto-generated method stub

	}

	private void displayHomeLoan() {
		System.out.println("Welcome to IBS Bank loan scheme!");
		System.out.println("Please enter the required amount of loan.");
		double loanAmount = read.nextDouble();
		boolean resultAmount = bankService.isValidLoanAmount(loanAmount);

		if (resultAmount) {
			System.out.println("Rate of interest for home loan:" + bankService.sendInterestHomeLoan());
			System.out.println("Please enter the tenure(in months) you would like to have loan.");
			int tenure = read.nextInt();
			boolean resultTenure = bankService.isValidTenure(tenure);
			if (resultTenure) {
				double emiAmount = bankService.sendEMI(loanAmount, tenure);
				System.out.println("EMI Amount is: INR " + emiAmount);
			} else {
				System.out.println("no");

			}
		} else {
			System.out.println("Please enter a valid loan amount.");
		}

	}

	public static void main(String[] args) {
		read = new Scanner(System.in);
		DisplayDetails display = new DisplayDetails();
		display.init();
		read.close();
	}
}
