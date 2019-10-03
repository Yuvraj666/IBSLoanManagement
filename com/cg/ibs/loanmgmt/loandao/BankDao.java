package com.cg.ibs.loanmgmt.loandao;

import com.cg.ibs.loanmgmt.bean.LoanMaster;

public interface BankDao {
	public boolean saveLoan(LoanMaster loanMaster);
	public boolean savePreClosure(LoanMaster loanMaster);

}
