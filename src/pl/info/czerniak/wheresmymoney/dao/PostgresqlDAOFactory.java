package pl.info.czerniak.wheresmymoney.dao;

public class PostgresqlDAOFactory extends DAOFactory{

    @Override
    public ProjectDAO getProjectDAO() {
        return ProjectDAOImpl();
    }

    @Override
    public UserDAO getUserDAO() {
        return UserDAOImpl();
    }

    @Override
    public PersonDAO getPersonDAO() {
        return PersonDAOImpl();
    }

    @Override
    public LoanDAO getLoanDAO() {
        return LoanDAOImpl();
    }

    @Override
    public BillDAO getBillDAO() {
        return BillDAOImpl();
    }

    @Override
    public BillItemDAO getBillItemDAO() {
        return BillItemDAOImpl();
    }
}
