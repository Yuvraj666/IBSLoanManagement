package com.cg.ibs.loanmgmt.bean;

public abstract class LoanDetails {
	private String loanType;
	private double loanLimit;
	private double loanAmount;
	private int loanTenure;
	private String guarantorName;

	public abstract double getLoanLimit();

	public abstract void setLoanLimit();

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}

	public String getGuarantorName() {
		return guarantorName;
	}

	public void setGuarantorName(String guarantorName) {
		this.guarantorName = guarantorName;
	}

}