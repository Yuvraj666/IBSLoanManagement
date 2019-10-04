package com.cg.ibs.loanmgmt.bean;

public class LoanMaster {
	private static long loanNumber;
	private double loanAmount;
	private int loanTenure;
	private double emiAmount;
	private CustomerBean customerBean;
	private int numberOfEmis;
	private int totalNumberOfEmis;

	public LoanMaster(double loanAmount, int loanTenure, double emiAmount, CustomerBean customerBean, int numberOfEmis,
			int totalNumberOfEmis) {
		super();
		this.loanAmount = loanAmount;
		this.loanTenure = loanTenure;
		this.emiAmount = emiAmount;
		this.customerBean = customerBean;
		this.numberOfEmis = numberOfEmis;
		this.totalNumberOfEmis = totalNumberOfEmis;
	}

	public LoanMaster() {
		super();
	}

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

	public long getLoanNumber() {
		return loanNumber;
	}

	public long setLoanNumber() {
		loanNumber++;
		return loanNumber;
	}

	public CustomerBean getCustomerBean() {
		return customerBean;
	}

	public void setCustomerBean(CustomerBean customerBean) {
		this.customerBean = customerBean;
	}

	public int getNumberOfEmis() {
		return numberOfEmis;
	}

	public int incrementNumberOfEmis() {
		numberOfEmis++;
		return numberOfEmis;
	}

	public int getTotalNumberOfEmis() {
		return totalNumberOfEmis;
	}

	public void setTotalNumberOfEmis(int totalNumberOfEmis) {
		this.totalNumberOfEmis = totalNumberOfEmis;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

}
