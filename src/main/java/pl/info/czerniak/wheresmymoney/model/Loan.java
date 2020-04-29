package pl.info.czerniak.wheresmymoney.model;

import java.util.Objects;

public class Loan {
    private long id;
    private String name;
    private String description;
    private Person personFrom;
    private Person personTo;

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

    public Person getPersonFrom() {
        return personFrom;
    }

    public void setPersonFrom(Person personFrom) {
        this.personFrom = personFrom;
    }

    public Person getPersonTo() {
        return personTo;
    }

    public void setPersonTo(Person personTo) {
        this.personTo = personTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return id == loan.id &&
                name.equals(loan.name) &&
                description.equals(loan.description) &&
                personFrom.equals(loan.personFrom) &&
                personTo.equals(loan.personTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, personFrom, personTo);
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
