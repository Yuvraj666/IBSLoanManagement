package com.cg.ibs.loanmgmt.loanservice;

import com.cg.ibs.bean.CustomerBean;
import com.cg.ibs.bean.Document;
import com.cg.ibs.loanmgmt.bean.LoanDetails;
import com.cg.ibs.loanmgmt.bean.LoanMaster;

public interface BankService {
	public boolean verifyLoan(CustomerBean customer,LoanDetails loanDetails, Document document);
	public LoanMaster approveLoan (boolean bool, CustomerBean customer, LoanDetails loanDetails, Document document);
	public boolean verifyPreClosure(long loanNumber);
	public LoanMaster approvePreClosure(LoanMaster loanMaster);

}
