package com.cg.ibs.loanmgmt.loanservice;

import com.cg.ibs.loanmgmt.bean.LoanType;

public class HomeLoan extends Loan {
	private final float interestRate = 8.5f ;
	
	public final double loanLimit = 20000000;
	
	public HomeLoan() {
		setLoanType(LoanType.HOME_LOAN);
	}
	
	@Override
	public String toString() {
		return "HomeLoan [interestRate=" + interestRate + ", LoanAmount= " + getLoanAmount() + ", LoanTenure ="
				+ getLoanTenure() + " months " + "getEmiAmount()= "+ getEmiAmount() + ", getLoanType()=" + getLoanType() + "]";
	}
	public boolean isValidLoanAmount(double loanAmount) {
		
			if (loanAmount < loanLimit && loanAmount > loanLowerLimit) {
				return true;
			} else {
				return false;
			}
		}
	public float getInterestRate() {
		return interestRate;
	}

}
