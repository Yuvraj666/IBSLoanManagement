package com.cg.ibsproject.service;

public interface BankService {
	public boolean isValidHomeLoanAmount(double loanAmount);

	public boolean isValidEducationLoanAmount(double loanAmount);

	public boolean isValidPersonalLoanAmount(double loanAmount);

	public boolean isValidVehicleLoanAmount(double loanAmount);

	public double sendInterestHomeLoan();

	public double sendInterestEducationLoan();

	public double sendInterestPersonalLoan();

	public double sendInterestVehicelLoan();

	public double sendEMIForHomeLoan(double loanAmount, int tenure);

	public double sendEMIForEducationLoan(double loanAmount, int tenure);

	public double sendEMIForPersonalLoan(double loanAmount, int tenure);

	public double sendEMIForVehicleLoan(double loanAmount, int tenure);

	public boolean isValidTenure(int tenure);

	// public void setLoanDetails(String loanType, double loanAmount, double
	// rateOfInterest, int loanTenure);
}
