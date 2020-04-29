package pl.info.czerniak.wheresmymoney.dao;

public abstract  class DAOFactory {
    public abstract ProjectDAO getProjectDAO();
    public abstract UserDAO getUserDAO();
    public abstract PersonDAO getPersonDAO();
    public abstract LoanDAO getLoanDAO();
    public abstract BillDAO getBillDAO();
    public abstract BillItemDAO getBillItemDAO();

}
