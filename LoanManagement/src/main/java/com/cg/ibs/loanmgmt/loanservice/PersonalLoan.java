package com.cg.ibs.loanmgmt.loanservice;

import com.cg.ibs.loanmgmt.bean.LoanType;

public class PersonalLoan extends Loan {
	private final float interestRate = 10.75f;
	public final double loanLimit = 2000000;

	public PersonalLoan() {
		setLoanType(LoanType.PERSONAL_LOAN);
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
