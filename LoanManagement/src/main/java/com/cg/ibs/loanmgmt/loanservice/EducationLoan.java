package com.cg.ibs.loanmgmt.loanservice;

import com.cg.ibs.loanmgmt.bean.LoanType;

public class EducationLoan extends Loan {
	private final float interestRate = 11.35f;
	public final double loanLimit = 5000000;

	public EducationLoan() {
		setLoanType(LoanType.EDUCATION_LOAN);
	}

	@Override
	public float getInterestRate() {
		return interestRate;
	}

	@Override
	public boolean isValidLoanAmount(double loanAmount) {
		if (loanAmount < loanLimit && loanAmount > loanLowerLimit) {
			return true;
		} else {
			return false;
		}
	}

}
