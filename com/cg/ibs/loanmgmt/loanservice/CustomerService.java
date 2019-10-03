package com.cg.ibs.loanmgmt.loanservice;

import java.util.List;

import com.cg.ibs.bean.Document;
import com.cg.ibs.loanmgmt.bean.LoanDetails;
import com.cg.ibs.loanmgmt.bean.LoanMaster;

public interface CustomerService {
	public boolean isValidHomeLoanAmount(double loanAmount);
	public LoanDetails applyLoan();
	public Document getDocument();
	public boolean applyPreClosure(long loanNumber);
	public LoanMaster payEMI(long loanNumber);
	public List<LoanMaster> getHistory(String userId);

}