package com.cg.ibs.loanmgmt.loanservice;

import java.util.List;

import com.cg.ibs.loanmgmt.bean.Document;
import com.cg.ibs.loanmgmt.bean.LoanMaster;

public class CustomerServiceImpl implements CustomerService {
	Loan loan;

	public Loan calculateEmi(Loan loan) {
		float rate = loan.getInterestRate()/(12*100) ;
		loan.setEmiAmount(((loan.getLoanAmount() * rate * Math.pow((rate + 1), loan.getLoanTenure())) / (Math.pow((rate + 1), loan.getLoanTenure()) - 1)));
		return loan;
		
	}
	public Loan applyLoan() {
		// TODO Auto-generated method stub
		return null;
	}

	public Document getDocument() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean applyPreClosure(long loanNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	public LoanMaster payEMI(long loanNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<LoanMaster> getHistory(String userId) {
		// TODO Auto-generated method stub
		return null;
	}



	public boolean loanCustomerInputVerificationService(Loan loan) {
		boolean amountValid = loan.isValidLoanAmount(loan.getLoanAmount());
		boolean tenureValid = loan.isValidTenure(loan.getLoanTenure());
		boolean check = false;
		if (amountValid & tenureValid ) {
			check = true;
		}
		return check;
		
	}

	
}
