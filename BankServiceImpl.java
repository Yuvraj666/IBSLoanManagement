package com.cg.ibsproject.service;

import com.cg.ibsproject.dao.*;

public class BankServiceImpl implements BankService {
	BankDao bankDao = new BankDaoImpl();


	public boolean isValidLoanAmount(double loanAmount) {
		if (loanAmount >= 0 && loanAmount <= 20000000) {
			return true;
		} else {
			return false;
		}
	}

	public double sendInterestHomeLoan() {
		double rate = bankDao.sendInterestHomeLoan();
		return rate;
	}

	public double sendEMI(double loanAmount,int tenure) {
		BankService bankService = new BankServiceImpl();
		double rate = bankService.sendInterestHomeLoan()/(12*100);
		double emiAmount = ((loanAmount*rate*Math.pow(rate+1, tenure))/Math.pow(rate+1, tenure-1));
		return emiAmount;
		}

	public boolean isValidTenure(int tenure) {
		if (tenure >= 0 && (tenure == 6 || tenure == 12 || tenure == 18)) {
			return true;
		} else {
			return false;
		}
	}
}
