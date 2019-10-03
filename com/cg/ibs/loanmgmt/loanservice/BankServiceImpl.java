package com.cg.ibs.loanmgmt.loanservice;

import com.cg.ibs.bean.CustomerBean;
import com.cg.ibs.bean.Document;
import com.cg.ibs.loanmgmt.bean.LoanDetails;
import com.cg.ibs.loanmgmt.bean.LoanMaster;
import com.cg.ibs.loanmgmt.loandao.BankDao;
import com.cg.ibs.loanmgmt.loandao.BankDaoImpl;

public class BankServiceImpl implements BankService {
	BankDao bankDao = new BankDaoImpl();
	@Override
	public boolean verifyLoan(CustomerBean customer, LoanDetails loanDetails, Document document) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LoanMaster approveLoan(boolean bool, CustomerBean customer, LoanDetails loanDetails, Document document) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verifyPreClosure(long loanNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LoanMaster approvePreClosure(LoanMaster loanMaster) {
		// TODO Auto-generated method stub
		return null;
	}

}
