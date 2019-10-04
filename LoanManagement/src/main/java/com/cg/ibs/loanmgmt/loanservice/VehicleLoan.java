package com.cg.ibs.loanmgmt.loanservice;

import com.cg.ibs.loanmgmt.bean.LoanType;

public class VehicleLoan extends Loan{
	private final float interestRate = 9.25f;
	public final double loanLimit = 3000000;
	public VehicleLoan() {
		setLoanType(LoanType.VEHICLE_LOAN);
	}
	@Override
	public float getInterestRate() {
		return interestRate;
	}
	@Override
	public boolean isValidLoanAmount(double loanAmount) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
