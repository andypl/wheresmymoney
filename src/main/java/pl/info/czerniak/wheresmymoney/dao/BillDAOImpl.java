package pl.info.czerniak.wheresmymoney.dao;

import pl.info.czerniak.wheresmymoney.model.Bill;

import java.util.List;

public class BillDAOImpl implements BillDAO{
    @Override
    public Bill create(Bill bill) {
        return null;
    }

    @Override
    public Bill read(Long id) {
        return null;
    }

    @Override
    public boolean update(Bill bill) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<Bill> getAll() {
        return null;
    }

    @Override
    public List<Bill> getBillByProjectId(long projectId) {
        return null;
    }
}
