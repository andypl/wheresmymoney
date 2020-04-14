package pl.info.czerniak.wheresmymoney.dao;

import pl.info.czerniak.wheresmymoney.model.User;

import java.util.List;

public interface UserDAO extends GenericDAO<User, Long>{

    @Override
    List<User> getAll();
    User getUserByUsername(String username);
}
