package com.cg.ibs.loanmgmt.ui;

import java.util.Scanner;

import com.cg.ibs.loanmgmt.loanservice.CustomerService;
import com.cg.ibs.loanmgmt.loanservice.CustomerServiceImpl;
import com.cg.ibs.loanmgmt.loanservice.HomeLoan;
import com.cg.ibs.loanmgmt.loanservice.Loan;

public class User {
	public static Scanner read;
	CustomerService customerService = new CustomerServiceImpl();
	Loan loan;

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
					createHomeLoan();
					break;
				case EDUCATION_LOAN:

					break;
				case PERSONAL_LOAN:

					break;
				case VEHICLE_LOAN:

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

	public void createHomeLoan() {
		loan = new HomeLoan();
		System.out.print("Interest Rate for Home Loan is : ");
		System.out.println(loan.getInterestRate() + "%");
		boolean check = false;
		while (check != true) {
			System.out.println("Enter the Loan Amount required  : ");
			System.out.println("***Minimum Loan Limit = 10 Thousand***");
			System.out.println("***Maximum Loan Limit = 2 Crores***");
			loan.setLoanAmount(read.nextDouble());
			System.out.println("Enter the Loan Tenure : ");
			System.out.println("***Tenure should be in months and multiple of 6***");
			loan.setLoanTenure(read.nextInt());
			check = customerService.loanCustomerInputVerificationService(loan);
			if (check == false) {
				System.out.println("Invalid inputs");
			}
		}
		loan = customerService.calculateEmi(loan);
		System.out.println(loan);
		customerService.getDocument();

		
	}

	public static void main(String[] args) {
		read = new Scanner(System.in);
		User user = new User();
		user.init();
		read.close();
	}
}
