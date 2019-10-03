package com.cg.ibsproject.service;

public interface BankService {
	public boolean isValidLoanAmount(double loanAmount);

	public double sendInterestHomeLoan();
	public double sendEMI(double loanAmount,int tenure);

	public boolean isValidTenure(int tenure);
}
