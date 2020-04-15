package pl.info.czerniak.wheresmymoney.dao;

import pl.info.czerniak.wheresmymoney.model.Bill;

import java.util.List;

public interface BillDAO extends GenericDAO<Bill, Long>{

    @Override
    List<Bill> getAll();
    public List<Bill> getBillByProjectId(long projectId);
}
