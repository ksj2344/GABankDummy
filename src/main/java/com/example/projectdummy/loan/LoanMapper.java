package com.example.projectdummy.loan;

import com.example.projectdummy.loan.model.*;


import com.example.projectdummy.loan.model.RateLog;
import com.example.projectdummy.loan.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface LoanMapper {

    List<Long> selLoan(int useFlag);
    List<Loan> selLoan2(int useFlag);
    int insLoanLog(RateLog rateLog);
    List<LoanInfo> selLoanInfo();
    int insLoanRepayment(LoanRepayment loanRepayment);
    List<Long> selLoanAccountId();
    double selDiscountedRate(long accountId);
    double selAdditionalRate(long accountId);
    int insLoanRateLog(LoanRateLog loanRateLog);
    int insLoanApplication(LoanApplication loanApplication);
    int selLoanAccountCnt();
    LoanAccount selLoanAccount(long accountId);
    LoanRepayment selLoanRepayment(LocalDateTime month, long accountId);
    LoanRepayment selLoanRepayment2(long loanRepaymentId);

    int updLoanRepaymentDueCode(long loanRepaymentId);
    int updLoanRepayment(long totalDue, long principal, long interest, long loanRepaymentId);
    int updLoanRepayment2(LocalDateTime finalAt, long loanRepaymentId);
    int insLoanOverdue(LoanOverdue loanOverdue);
    LoanOverdue selLoanOverdue(long overdueId);
    int selOverdueCnt();
}
