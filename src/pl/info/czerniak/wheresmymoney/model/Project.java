package pl.info.czerniak.wheresmymoney.model;

import java.sql.Timestamp;
import java.util.*;

public class Project {
    private long id;
    private String name;
    private String description;
    private Timestamp createdOn;
    private User createdByUser;
    private LinkedList<Person> personsList;
    private LinkedList<Bill> billList;
    private LinkedList<Loan> loanList;

    public Project() { }
    public Project(Project project){
        this.id = project.getId();
        this.name = project.getName();
        this.description = project.getDescription();
        this.createdOn = new Timestamp(project.getCreatedOn().getTime());
        this.createdByUser = new User(project.getCreatedByUser());
        this.personsList = new LinkedList<>();
        this.billList = new LinkedList<>();
        this.loanList = new LinkedList<>();
    }

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

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public User getCreatedByUser() {
        return createdByUser;
    }

    public LinkedList<Person> getPersonsList() {
        return personsList;
    }

    public LinkedList<Bill> getBillList() {
        return billList;
    }

    public LinkedList<Loan> getLoanList() {
        return loanList;
    }

    public void removeBillFromList(HashMap<Long, Bill> bill){
        this.billList.remove(bill);
    }
    public void addBillToList(Bill bill){
        this.billList.add(bill);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return id == project.id &&
                name.equals(project.name) &&
                description.equals(project.description) &&
                createdOn.equals(project.createdOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, createdOn);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}