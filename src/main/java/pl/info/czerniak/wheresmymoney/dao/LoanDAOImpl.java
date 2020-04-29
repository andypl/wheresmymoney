package pl.info.czerniak.wheresmymoney.dao;

import pl.info.czerniak.wheresmymoney.model.Loan;

import java.util.List;

public class LoanDAOImpl implements LoanDAO{
    @Override
    public Loan create(Loan loan) {
        return null;
    }

    @Override
    public Loan read(Long id) {
        return null;
    }

    @Override
    public boolean update(Loan loan) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<Loan> getAll() {
        return null;
    }

    @Override
    public List<Loan> getLoanByProjectId(long projectId) {
        return null;
    }
}
