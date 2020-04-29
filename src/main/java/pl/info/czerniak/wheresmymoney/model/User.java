package pl.info.czerniak.wheresmymoney.model;

import java.sql.Timestamp;
import java.util.Objects;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private Timestamp createdOn;

    public User(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.createdOn = new Timestamp(user.getCreatedOn().getTime());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                firstName.equals(user.firstName) &&
                lastName.equals(user.lastName) &&
                createdOn.equals(user.createdOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, createdOn);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
