package pl.info.czerniak.wheresmymoney.model;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public class Bill {

    private long id;
    private String name;
    private String description;
    private LinkedList<BillItem> billItemList;
    private float totalAmount;
    private Timestamp createdOn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return id == bill.id &&
                Float.compare(bill.totalAmount, totalAmount) == 0 &&
                name.equals(bill.name) &&
                description.equals(bill.description) &&
                billItemList.equals(bill.billItemList) &&
                createdOn.equals(bill.createdOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, billItemList, totalAmount, createdOn);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", totalAmount=" + totalAmount +
                ", createdOn=" + createdOn +
                '}';
    }
}
