package pl.info.czerniak.wheresmymoney.model;


import java.util.Objects;

public class BillItem {

    private long id;
    private float amount;
    private Person personPay;
    private Person personPayFor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Person getPersonPay() {
        return personPay;
    }

    public void setPersonPay(Person personPay) {
        this.personPay = personPay;
    }

    public Person getPersonPayFor() {
        return personPayFor;
    }

    public void setPersonPayFor(Person personPayFor) {
        this.personPayFor = personPayFor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillItem billItem = (BillItem) o;
        return id == billItem.id &&
                Float.compare(billItem.amount, amount) == 0 &&
                personPay.equals(billItem.personPay) &&
                personPayFor.equals(billItem.personPayFor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, personPay, personPayFor);
    }

    @Override
    public String toString() {
        return "BillItem{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
