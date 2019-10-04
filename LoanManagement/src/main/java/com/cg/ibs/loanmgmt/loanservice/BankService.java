package com.cg.ibs.loanmgmt.loanservice;

import com.cg.ibs.loanmgmt.bean.CustomerBean;
import com.cg.ibs.loanmgmt.bean.Document;
import com.cg.ibs.loanmgmt.bean.LoanMaster;

public interface BankService {
	public boolean verifyLoan(CustomerBean customer,Loan loan, Document document);
	public LoanMaster approveLoan (CustomerBean customer, Loan loan, Document document);
	public boolean verifyPreClosure(long loanNumber);
	public LoanMaster approvePreClosure(LoanMaster loanMaster);

}
