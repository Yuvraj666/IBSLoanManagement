package com.cg.ibs.loanmgmt.loanservice;

import java.util.List;

import com.cg.ibs.loanmgmt.bean.Document;
import com.cg.ibs.loanmgmt.bean.LoanMaster;

public interface CustomerService {
	public Loan applyLoan();
	public Loan calculateEmi(Loan loan);

	public Document getDocument();

	public boolean applyPreClosure(long loanNumber);

	public LoanMaster payEMI(long loanNumber);

	public List<LoanMaster> getHistory(String userId);

	public boolean loanCustomerInputVerificationService(Loan loan);

}