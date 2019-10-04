package com.cg.ibsproject.service;

import com.cg.ibsproject.dao.BankDao;
import com.cg.ibsproject.dao.BankDaoImpl;

public class BankServiceImpl implements BankService {
	private BankDao bankDao = new BankDaoImpl();

	public boolean isValidHomeLoanAmount(double loanAmount) {
		boolean resultHomeLoan = false;
		if (loanAmount >= 0 && loanAmount <= 20000000) {
			resultHomeLoan = true;
		}
		return resultHomeLoan;
	}

	public boolean isValidEducationLoanAmount(double loanAmount) {
		boolean resultEducationLoan = false;
		if (loanAmount >= 0 && loanAmount <= 1000000) {
			resultEducationLoan = true;
		}
		return resultEducationLoan;
	}

	public boolean isValidPersonalLoanAmount(double loanAmount) {
		boolean resultPersonalLoan = false;
		if (loanAmount >= 0 && loanAmount <= 2000000) {
			resultPersonalLoan = true;
		}
		return resultPersonalLoan;
	}

	public boolean isValidVehicleLoanAmount(double loanAmount) {
		boolean result = false;
		if (loanAmount >= 0 && loanAmount <= 800000) {
			result = true;
		}
		return result;
	}

	public double sendInterestHomeLoan() {
		return bankDao.sendInterestHomeLoan();
	}

	public double sendInterestEducationLoan() {
		return bankDao.sendInterestEducationLoan();
	}

	public double sendInterestPersonalLoan() {
		return bankDao.sendInterestPersonalLoan();

	}

	public double sendInterestVehicelLoan() {
		return bankDao.sendInterestVehicleLoan();

	}

	public boolean isValidTenure(int tenure) {
		boolean result = false;
		if (tenure >= 0 && (tenure == 6 || tenure == 12 || tenure == 18)) {
			result = true;
		}
		return result;
	}

	public double sendEMIForHomeLoan(double loanAmount, int tenure) {
		double rate = bankDao.sendInterestHomeLoan() / (12 * 100);
		return ((loanAmount * rate * Math.pow(rate + 1, tenure)) / Math.pow(rate + 1, tenure - 1));
	}

	public double sendEMIForEducationLoan(double loanAmount, int tenure) {
		double rate = bankDao.sendInterestEducationLoan() / (12 * 100);
		return ((loanAmount * rate * Math.pow(rate + 1, tenure)) / Math.pow(rate + 1, tenure - 1));
	}

	public double sendEMIForVehicleLoan(double loanAmount, int tenure) {
		double rate = bankDao.sendInterestVehicleLoan() / (12 * 100);
		return ((loanAmount * rate * Math.pow(rate + 1, tenure)) / Math.pow(rate + 1, tenure - 1));
	}

	public double sendEMIForPersonalLoan(double loanAmount, int tenure) {
		double rate = bankDao.sendInterestPersonalLoan() / (12 * 100);
		return ((loanAmount * rate * Math.pow(rate + 1, tenure)) / Math.pow(rate + 1, tenure - 1));
	}

	/*
	 * public void setLoanDetails(String loanType, double loanAmount, double
	 * rateOfInterest, int loanTenure) { LoanDetails loanDetails = new
	 * LoanDetails(); loanDetails.setLoanType(loanType);
	 * loanDetails.setLoanAmount(loanAmount);
	 * loanDetails.setInterestRate(rateOfInterest);
	 * loanDetails.setLoanTenure(loanTenure);
	 * 
	 * }
	 */
}
