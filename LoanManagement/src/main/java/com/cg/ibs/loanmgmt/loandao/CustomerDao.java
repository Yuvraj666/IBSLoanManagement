package com.cg.ibs.loanmgmt.loandao;

import java.util.List;

import com.cg.ibs.bean.Document;
import com.cg.ibs.loanmgmt.bean.LoanDetails;
import com.cg.ibs.loanmgmt.bean.LoanMaster;

public interface CustomerDao {
	
	public boolean updateEMI(LoanMaster loanMaster);
	public List<LoanMaster> getHistory(String userId);

}
