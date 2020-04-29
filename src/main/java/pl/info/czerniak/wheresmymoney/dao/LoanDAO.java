package pl.info.czerniak.wheresmymoney.dao;

import pl.info.czerniak.wheresmymoney.model.Loan;

import java.util.List;

public interface LoanDAO extends GenericDAO<Loan, Long>{

    @Override
    List<Loan> getAll();
    List<Loan> getLoanByProjectId(long projectId);
}
