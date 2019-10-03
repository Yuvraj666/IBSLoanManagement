package com.cg.ibs.loanmgmt.loanservice;

import java.util.List;

import com.cg.ibs.bean.Document;
import com.cg.ibs.loanmgmt.bean.LoanDetails;
import com.cg.ibs.loanmgmt.bean.LoanMaster;

public class CustomerServiceImpl implements CustomerService {
	LoanDetails loanDetails = new LoanDetails();
	

	@Override
	public LoanDetails applyLoan() {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document getDocument() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean applyPreClosure(long loanNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LoanMaster payEMI(long loanNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanMaster> getHistory(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public boolean isValidHomeLoanAmount(double loanAmount) {
		if (loanAmount >= 0 && loanAmount <= 20000000) {
			return true;
		} else {
			return false;
		}
	}
}
