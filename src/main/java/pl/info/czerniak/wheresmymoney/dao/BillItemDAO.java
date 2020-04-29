package pl.info.czerniak.wheresmymoney.dao;

import pl.info.czerniak.wheresmymoney.model.BillItem;

import java.util.List;

public interface BillItemDAO extends GenericDAO<BillItem, Long> {

    @Override
    List<BillItem> getAll();
    List<BillItem> getBillItemByBillId(long billId);
}
