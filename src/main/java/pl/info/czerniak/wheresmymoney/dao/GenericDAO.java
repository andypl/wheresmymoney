package pl.info.czerniak.wheresmymoney.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO <T, PK extends Serializable>{
    T create(T t);
    T read(PK pk);
    boolean update(T t);
    boolean delete(PK pk);
    List<T> getAll();
}
