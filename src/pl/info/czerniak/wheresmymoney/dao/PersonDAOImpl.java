package pl.info.czerniak.wheresmymoney.dao;

import pl.info.czerniak.wheresmymoney.model.Person;

import java.util.List;

public class PersonDAOImpl implements PersonDAO{
    @Override
    public Person create(Person person) {
        return null;
    }

    @Override
    public Person read(Long id) {
        return null;
    }

    @Override
    public boolean update(Person person) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<Person> getAll() {
        return null;
    }

    @Override
    public List<Person> getPersonByProjectId(long projectId) {
        return null;
    }
}
