package com.cg.ibs.loanmgmt.bean;

import java.math.BigDecimal;

import com.cg.ibs.bean.CustomerBean;

public class LoanMaster {

	private static long loanNumber;
	private LoanDetails loanDetails;
	private CustomerBean customerBean;
	private int numberOfEmis;
	private int totalNumberOfEmis;
	private BigDecimal emiAmount;

	public LoanMaster() {
		super();
	}

	public LoanMaster(long loanNumber, LoanDetails loanDetails, CustomerBean customerBean, int numberOfEmis,
			int totalNumberOfEmis, BigDecimal emiAmount) {
		super();
		this.loanDetails = loanDetails;
		this.customerBean = customerBean;
		this.numberOfEmis = numberOfEmis;
		this.totalNumberOfEmis = totalNumberOfEmis;
		this.emiAmount = emiAmount;
	}

	public long getLoanNumber() {
		return loanNumber;
	}

	public long setLoanNumber() {
		loanNumber++;
		return loanNumber;
	}

	public LoanDetails getLoanDetails() {
		return loanDetails;
	}

	public void setLoanDetails(LoanDetails loanDetails) {
		this.loanDetails = loanDetails;
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

	public BigDecimal getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(BigDecimal emiAmount) {
		this.emiAmount = emiAmount;
	}

}
