package pl.info.czerniak.wheresmymoney.dao;

import pl.info.czerniak.wheresmymoney.model.Person;

import java.util.List;

public interface PersonDAO extends GenericDAO<Person, Long>{

    @Override
    List<Person> getAll();
    public List<Person> getPersonByProjectId(long projectId);
}
