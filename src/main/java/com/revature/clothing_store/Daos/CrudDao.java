package com.revature.clothing_store.Daos;

import java.util.List;

public interface CrudDao <T>{
    Object save(T obj);

    List<T> findAll();

    T findById(int id);

    List<T> findAllById(int id);

    boolean update(T updatedObj);

    boolean removeById(String id);



}
