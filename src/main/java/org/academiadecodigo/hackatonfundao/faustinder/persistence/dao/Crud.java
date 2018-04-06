package org.academiadecodigo.hackatonfundao.faustinder.persistence.dao;

import java.util.List;

public interface Crud<T> {

    /**
     * Save or update the model
     * @param model Database model
     * @return model saved or updated
     */
    T saveOrUpdate(T model);

    /**
     * Find by a column label
     * @param columnLabel database column name
     * @return first model found
     */
    T find(String columnLabel);

    T findBy(String columnLabel, Object by);

    /**
     * Returns a list of models
     * @return list of models
     */
    List<T> all();

    void delete(T model);
}
