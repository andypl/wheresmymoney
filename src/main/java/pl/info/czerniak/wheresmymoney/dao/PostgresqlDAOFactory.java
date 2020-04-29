package pl.info.czerniak.wheresmymoney.dao;

public class PostgresqlDAOFactory extends DAOFactory{

    @Override
    public ProjectDAO getProjectDAO() {
        return new ProjectDAOImpl();
    }

    @Override
    public UserDAO getUserDAO() {
        return new UserDAOImpl();
    }

    @Override
    public PersonDAO getPersonDAO() {
        return new PersonDAOImpl();
    }

    @Override
    public LoanDAO getLoanDAO() {
        return new LoanDAOImpl();
    }

    @Override
    public BillDAO getBillDAO() {
        return new BillDAOImpl();
    }

    @Override
    public BillItemDAO getBillItemDAO() {
        return new BillItemDAOImpl();
    }
}
